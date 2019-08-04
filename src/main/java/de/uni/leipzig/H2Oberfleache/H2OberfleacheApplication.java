package de.uni.leipzig.H2Oberfleache;

import de.uni.leipzig.H2Oberfleache.parser.SQL_Parser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class H2OberfleacheApplication {

	public static void main(String[] args) {
		SQL_Parser.test();
		SpringApplication.run(H2OberfleacheApplication.class, args);
	}

}
