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

	public void EmprunterDocument() {

	}

	public void RetournerDocument() {

	}

	public void AfficherTousDocuments() {
		for (Document doc : documents) {
			doc.afficherDetails();
		}

	}
}
