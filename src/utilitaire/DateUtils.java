package utilitaire;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateUtils {

    public static LocalDate convertStringToDate(String dateStr) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            return LocalDate.parse(dateStr, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Erreur : format de date invalide. Utilisez 'yyyy-MM-dd'.");
            return null;
        }
    }
}
