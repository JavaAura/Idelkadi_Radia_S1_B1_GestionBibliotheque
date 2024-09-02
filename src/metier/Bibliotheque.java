package metier;

import java.util.*;

public class Bibliotheque {
	public ArrayList<Document> documents = new ArrayList<Document>();
	public HashMap<String, Document> rechercheDocument = new HashMap<String, Document>();

	public void AjouterDocument(Document doc) {
		documents.add(doc);
		rechercheDocument.put(doc.getTitre(), doc);

		System.out.printf("Le document à était ajouté avec succés avec l'ID = %d , Titre = %s .", doc.id, doc.titre);

	}

	public void EmprunterDocument(String titre) {
		Document doc = this.RechercherDocument(titre);
		if (doc != null) {
			doc.emprunter();
		}
	}

	public void RetournerDocument(String titre) {
		Document doc = this.RechercherDocument(titre);
		if (doc != null) {
			doc.retourner();
		}
	}

	public void AfficherTousDocuments() {
		for (Document doc : documents) {
			doc.afficherDetails();
		}

	}

	public Document RechercherDocument(String titreDoc) {
		Document doc = rechercheDocument.get(titreDoc);
		if (doc != null) {
			return doc;
		} else {
			System.out.println("Document introuvable.");
			return null;
		}
	}
}
