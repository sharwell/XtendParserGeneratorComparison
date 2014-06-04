package xtend.antlr4_2;

import org.antlr.v4.Tool;

public class GenerateAntlr4Parser {

	public static void main(String[] args) {
		// To generate the Antlr4 parser, the Antlr3 jars have to be removed from the classpath
		// since it contains types with same name but different signatures
		try {
			Tool.main(new String[] {"src/xtend/antlr4_2/Xtend.g4"});
		} catch(Throwable t) {
			t.printStackTrace();
		}
	}
}
