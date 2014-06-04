package xtend.antlr3_2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;

import com.google.common.io.CharStreams;

public class XtendAntrl3Parser {

	public static void main(String[] args) throws IOException {
		String string1 = CharStreams.toString(new FileReader(new File("src/1.txt")));
		String string2 = CharStreams.toString(new FileReader(new File("src/2.txt")));
		String string3 = CharStreams.toString(new FileReader(new File("src/3.txt")));
		for(int i = 0; i< 100; i++) {
			doParse(string1);
			doParse(string2);
			doParse(string3);
		}
		long currentTimeMillis = System.currentTimeMillis();
		// only 1.txt, Antlr 3.5
		// 32615 with unicode identifiers, 3.5
		// 2401, 2142 without unicode identifiers, 3.5 
		
		// all three samples, no unicode, 3.5
		// 9748
		
		// all three samples, no unicode, 3.2, Java8
		// 6955, 7518, 6838, 6681, 7899
		for(int i = 0; i< 1000; i++) { 
			doParse(string1);
			doParse(string2);
			doParse(string3);
		}
		System.out.println((System.currentTimeMillis() - currentTimeMillis) + " ms");
	}

	private static void doParse(String string) {
		try {
			// stock Antlr 3 parsing
			ANTLRStringStream stream = new ANTLRStringStream(string);
			XtendLexer lexer = new XtendLexer(stream);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			XtendParser parser = new XtendParser(tokens);
			parser.ruleFile();
		} catch(Throwable t) {
			t.printStackTrace();
		}
	}
}
