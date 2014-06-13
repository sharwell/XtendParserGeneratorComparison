package xtend.antlr4_2;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.atn.PredictionMode;

import xtend.antlr4_2.XtendParser.RuleFileContext;

import com.google.common.io.CharStreams;


public class XtendAntlr4Parser {
	
	public static void main(String[] args) throws IOException {
		String string1 = CharStreams.toString(new InputStreamReader(new FileInputStream(new File("src/1.txt")), "UTF-8"));
		String string2 = CharStreams.toString(new InputStreamReader(new FileInputStream(new File("src/2.txt")), "UTF-8"));
		String string3 = CharStreams.toString(new InputStreamReader(new FileInputStream(new File("src/3.txt")), "UTF-8"));
		for(int i = 0; i< 100; i++) {
			doParse(string1);
			doParse(string2);
			doParse(string3);
		}
		long currentTimeNs = System.nanoTime();
		// only 1.txt
		// 74541 with unicode identifiers
		// 78327 without unicode identifiers
		// 74980 without parse tree building
		
		// all three samples with fancy prediction mode
		// aborted after 10 mins
		
		// fast prediction mode (SLL)
		// 16317, 14811, 17159, 13334, 14734, 
		for(int i = 0; i< 1000; i++) { 
			doParse(string1);
			doParse(string2);
			doParse(string3);
		}
		System.out.println(((System.nanoTime()- currentTimeNs) / 1000000) + " ms");
	}
	
	private static void doParse(String string) {
		try {
			ANTLRInputStream stream = new ANTLRInputStream(string);
			XtendLexer lexer = new XtendLexer(stream);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			XtendParser parser = new XtendParser(tokens);
			// don't do fancy prediction, but use only the fast mode
			parser.getInterpreter().setPredictionMode(PredictionMode.SLL);
			// fail on error
			parser.setErrorHandler(new BailErrorStrategy());
			// don't build any trees
			parser.setBuildParseTree(false);
			RuleFileContext tree = parser.ruleFile();
			if (tree.children != null) {
				throw new RuntimeException("There seems to be some misconfiguration");
			}
		} catch(Throwable t) {
			t.printStackTrace();
		}
	}
}
