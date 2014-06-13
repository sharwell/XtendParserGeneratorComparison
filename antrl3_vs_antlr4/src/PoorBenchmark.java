import java.io.IOException;

import xtend.antlr3_2.XtendAntrl3Parser;
import xtend.antlr4_2.XtendAntlr4Parser;

/*

Java8:
======
Antlr 4.2: 14475 ms
Antlr 3.2: 6635 ms
Antlr 4.2: 14313 ms
Antlr 3.2: 6221 ms
Antlr 4.2: 14373 ms
Antlr 3.2: 6273 ms
Antlr 4.2: 14344 ms
Antlr 3.2: 6176 ms
Antlr 4.2: 14294 ms
Antlr 3.2: 6204 ms
Antlr 4.2: 14353 ms
Antlr 3.2: 6163 ms
Antlr 4.2: 14357 ms
Antlr 3.2: 6181 ms
Antlr 4.2: 14297 ms
Antlr 3.2: 6159 ms
Antlr 4.2: 14273 ms
Antlr 3.2: 6368 ms
Antlr 4.2: 14272 ms
Antlr 3.2: 6211 ms

Java7 -server:
==============
Antlr 4.2: 13877 ms
Antlr 3.2: 8012 ms
Antlr 4.2: 13717 ms
Antlr 3.2: 7813 ms
Antlr 4.2: 13526 ms
Antlr 3.2: 7960 ms
Antlr 4.2: 13550 ms
Antlr 3.2: 7825 ms
Antlr 4.2: 13486 ms
Antlr 3.2: 7736 ms
Antlr 4.2: 13531 ms
Antlr 3.2: 7812 ms
Antlr 4.2: 14466 ms
Antlr 3.2: 8006 ms
Antlr 4.2: 13667 ms
Antlr 3.2: 8003 ms
Antlr 4.2: 13621 ms
Antlr 3.2: 7787 ms
Antlr 4.2: 13569 ms
Antlr 3.2: 7749 ms

 */
public class PoorBenchmark {

	public static void main(String[] args) throws IOException {
		for(int i = 0; i < 10; i++) {
			System.out.print("Antlr 4.2.2: ");
			XtendAntlr4Parser.main(null);
			System.out.print("Antlr 3.5.2: ");
			XtendAntrl3Parser.main(null);
		}
	}
	
}
