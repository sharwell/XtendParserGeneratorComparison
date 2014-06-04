package xtend.antlr3_2;

import org.antlr.Tool;

public class GenerateAntlr3Parser {

	public static void main(String[] args) {
		// To generate the Antlr3 parser, the Antlr4 jar has to be removed from the classpath
		// since it contains types with same name but different signatures
		try {
			Tool.main(new String[] {"src/xtend/antlr3_2/Xtend.g"});
		} catch(Throwable t) {
			t.printStackTrace();
		}
	}
}
