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

	// Affiche le menu principal à l'utilisateur
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

	// Permet d'ajouter un document (Livre ou Magazine) à la bibliothèque.

	private static void ajouterDocument() {
		System.out.println("Quel type de Document que vous voulez inserer? (1-Livre , 2-Magazine)");
		int type = scanner.nextInt();

		scanner.nextLine(); // Consomme la nouvelle ligne restante
		Random rand = new Random();
		int id = rand.nextInt(1000);

		System.out.println("Titre:");
		String titre = scanner.nextLine();

		System.out.println("Auteur:");
		String auteur = scanner.nextLine();

		LocalDate datePublication = null;
		while (datePublication == null) { // Boucle jusqu'à obtenir une date valide
			System.out.print("Date de publication (YYYY-MM-DD) : ");
			String dateStr = scanner.nextLine();
			datePublication = DateUtils.convertStringToDate(dateStr);

			if (datePublication == null) {
				System.out.println("Erreur : format de date invalide. Utilisez 'yyyy-MM-dd'.");
			}
		}
		System.out.println("Nombre de pages:");
		int nbrpages = scanner.nextInt();

		if (type == 1) {// Si l'utilisateur choisit d'ajouter un livre

			System.out.println("ISBN:");
			int isbn = scanner.nextInt();

			Livre livre = new Livre(id, titre, auteur, datePublication, nbrpages, isbn);
			bibliotheque.AjouterDocument(livre);

		} else if (type == 2) {// Si l'utilisateur choisit d'ajouter magazine

			System.out.println("Numero:");
			int numero = scanner.nextInt();

			Magazine magazine = new Magazine(id, titre, auteur, datePublication, nbrpages, numero);
			bibliotheque.AjouterDocument(magazine);

		} else {
			System.out.println("Type de document invalide.");
		}

	}

	// emprunter un document en fonction de son titre
	private static void emprunterDocument() {
		scanner.nextLine();
		System.out.print("Entrez le titre du document à emprunter : ");
		String titreDoc = scanner.nextLine();
		bibliotheque.EmprunterDocument(titreDoc);
	}

	// retourner un document en fonction de son titre
	private static void retournerDocument() {
		scanner.nextLine();
		System.out.print("Entrez le titre du document à retourner : ");
		String titreDoc = scanner.nextLine();
		bibliotheque.RetournerDocument(titreDoc);
	}

	// Affiche tous les documents
	private static void afficherTousLesDocuments() {
		bibliotheque.AfficherTousDocuments();
	}

	// Recherche un document par son titre et affiche ses détails s'il est trouvé
	private static void rechercherDocument() {
		scanner.nextLine();
		System.out.print("Entrez le titre du document à rechercher : ");
		String titreDoc = scanner.nextLine();

		Document docRecherche = bibliotheque.RechercherDocument(titreDoc);

		if (docRecherche != null) {
			docRecherche.afficherDetails();
		} else {
			System.out.println("Document introuvable.");
		}
	}

}