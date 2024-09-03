package utilitaire;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateUtils {

	//Convertit une chaîne de caractères représentant une date en un objet LocalDate.
	public static LocalDate convertStringToDate(String dateStr) {
		try {
			// Définition du format de la date attendu : "yyyy-MM-dd"
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            
            // Conversion de la chaîne de caractères en objet LocalDate
            return LocalDate.parse(dateStr, formatter);
		} catch (DateTimeParseException e) {
			System.out.println("Erreur : format de date invalide. Utilisez 'yyyy-MM-dd'.");
			return null;
		}
	}
}
