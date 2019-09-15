package de.uni.leipzig.H2Oberfleache;

import de.uni.leipzig.H2Oberfleache.parser.SQL_Parser;
import de.uni.leipzig.H2Oberfleache.parser.SQLiteLexer;
import de.uni.leipzig.H2Oberfleache.parser.SQLiteParser;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Map;

@SpringBootApplication
public class H2OberfleacheApplication {

	public static void main(String[] args) {
		String sql = "UPDA2TE PERSONEN.ADRESSE SET PLZ='44142' \n" +
				"W#HERE ORT<'DORTMUND' AND STRASSE='ALBERT-KÄSTNER-WEG'";
		String sql1 = "SELECT P.ALTER, P.PERSNR, P.NAME, UNNEST P.ADRESSE ON (PLZ, ORT, \n" +
				"STRASSE, HAUSNR) FROM PERSONEN P";
		System.out.println(matches(sql1));
		System.out.println(matches(sql));
		SpringApplication.run(H2OberfleacheApplication.class, args);
	}

	public static boolean matches(String input) {
		try {
			SQLiteLexer lexer = new SQLiteLexer(CharStreams.fromString(input));
			SQLiteParser parser = new SQLiteParser(new CommonTokenStream(lexer));
			parser.parse();
			return true;
		} catch(Exception e) {
			return false;
		}
	}

}
