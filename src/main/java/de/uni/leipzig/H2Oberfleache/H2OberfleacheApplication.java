package de.uni.leipzig.H2Oberfleache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class H2OberfleacheApplication {

	public static void main(String[] args) {
		String sql = "UPDATE PERSONEN.ADRESSE SET PLZ='44142' \n" +
				"W#HERE ORT<'DORTMUND' AND STRASSE='ALBERT-KÄSTNER-WEG'";
		String sql1 = "SELECT P.ALTER, P.PERSNR, P.NAME, UNNEST P.ADRESSE ON (PLZ, ORT, \n" +
				"STRASSE, HAUSNR) FROM PERSONEN P";
		SpringApplication.run(H2OberfleacheApplication.class, args);
	}



}
