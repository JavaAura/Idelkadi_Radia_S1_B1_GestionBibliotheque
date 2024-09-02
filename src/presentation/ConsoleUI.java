package presentation;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

import metier.*;
import utilitaire.DateUtils;

public class ConsoleUI {
	private static Bibliotheque bibliotheque = new Bibliotheque();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int choix;
		do {
			afficherMenu();
			choix = scanner.nextInt();
			switch (choix) {
			case 1:
				ajouterDocument();
				break;
			case 2:
				emprunterDocument();
				break;
			case 3:
				retournerDocument();
				break;
			case 4:
				afficherTousLesDocuments();
				break;
			case 5:
				rechercherDocument();
				break;
			case 6:
				System.out.println("Au revoir!");
				break;
			default:
				System.out.println("Choix invalide, veuillez réessayer.");
			}
		} while (choix != 6);
	}

	private static void afficherMenu() {
		System.out.println("\nMenu:");
		System.out.println("1. Ajouter un document");
		System.out.println("2. Emprunter un document");
		System.out.println("3. Retourner un document");
		System.out.println("4. Afficher tous les documents");
		System.out.println("5. Rechercher un document");
		System.out.println("6. Quitter");
		System.out.print("Veuillez entrer votre choix (1-6) : ");
	}

	private static void ajouterDocument() {
		System.out.println("Quel type de Document que vous voulez inserer? (1-Livre , 2-Magazine)");
		int type = scanner.nextInt();

		scanner.nextLine();
		Random rand = new Random();
		int id = rand.nextInt(1000);

		System.out.println("Titre:");
		String titre = scanner.nextLine();

		System.out.println("Auteur:");
		String auteur = scanner.nextLine();

		System.out.print("Date de publication (YYYY-MM-DD) : ");
		String dateStr = scanner.nextLine();
		LocalDate datePublication = DateUtils.convertStringToDate(dateStr);

		System.out.println("Nombre de pages:");
		int nbrpages = scanner.nextInt();

		if (type == 1) {

			System.out.println("ISBN:");
			int isbn = scanner.nextInt();

			Livre livre = new Livre(id, titre, auteur, datePublication, nbrpages, isbn);
			bibliotheque.AjouterDocument(livre);

		} else if (type == 2) {

			System.out.println("Numero:");
			int numero = scanner.nextInt();

			Magazine magazine = new Magazine(id, titre, auteur, datePublication, nbrpages, numero);
			bibliotheque.AjouterDocument(magazine);

		} else {
			System.out.println("Type de document invalide.");
		}

	}

	private static void emprunterDocument() {
		scanner.nextLine();
		System.out.println("Quel est le titre du document que vous voulez emprunter?");
		String titreDoc = scanner.nextLine();
		bibliotheque.EmprunterDocument(titreDoc);
	}

	private static void retournerDocument() {
		scanner.nextLine();
		System.out.println("Titre du document retourner : ");
		String titreDoc = scanner.nextLine();
		bibliotheque.RetournerDocument(titreDoc);
	}

	private static void afficherTousLesDocuments() {
		bibliotheque.AfficherTousDocuments();
	}

	private static void rechercherDocument() {
		scanner.nextLine();
		System.out.println("Le titre du document que vous voulez rechercher ?");
		String titreDoc = scanner.nextLine();

		Document docRecherche = bibliotheque.RechercherDocument(titreDoc);

		if (docRecherche != null) {
			docRecherche.afficherDetails();
		}
	}
}