package metier;

import java.util.*;

public class Bibliotheque {

	private ArrayList<Document> documents;
	private HashMap<String, Document> rechercheRapide;

	public Bibliotheque() {
		this.documents = new ArrayList<>();
		this.rechercheRapide = new HashMap<>();
	}

	public void AjouterDocument(Document doc) {
		documents.add(doc);
		rechercheRapide.put(doc.titre, doc);
		System.out.printf("Le document à était ajouté avec succés avec l'ID = %d , Titre = %s .", doc.id, doc.titre);

	}

	public void EmprunterDocument(String titre) {
		Document doc = this.RechercherDocument(titre);
		if (doc != null) {
			doc.emprunter();
		} else {
			System.out.println("Document introuvable.");
		}
	}

	public void RetournerDocument(String titre) {
		Document doc = this.RechercherDocument(titre);
		if (doc != null) {
			doc.retourner();
		} else {
			System.out.println("Document introuvable.");
		}
	}

	public void AfficherTousDocuments() {
		for (Document doc : documents) {
			doc.afficherDetails();
		}

	}

	public Document RechercherDocument(String titreDoc) {
		Document doc = rechercheRapide.get(titreDoc);
		if (doc != null) {
			return doc;
		} else {
			return null;
		}
	}
}
