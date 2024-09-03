package metier;

import java.time.LocalDate;

public abstract class Document {

	protected int id;
	protected String titre;
	protected String auteur;
	protected LocalDate datePublication;
	protected int nombreDePages;
	protected boolean estEmprunte;

    /**
     * Constructeur de la classe Document. Initialise les attributs communs à tous les documents.
     *
     * @param ID              L'identifiant unique du document.
     * @param Titre           Le titre du document.
     * @param Auteur          L'auteur du document.
     * @param DateDePublication La date de publication du document.
     * @param NombreDePages   Le nombre de pages du document.
     */
	
	public Document(int ID, String Titre, String Auteur, LocalDate DateDePublication, int NombreDePages) {
		this.id = ID;
		this.titre = Titre;
		this.auteur = Auteur;
		this.datePublication = DateDePublication;
		this.nombreDePages = NombreDePages;
		this.estEmprunte = false;
	}

    // Méthode abstraite pour emprunter le document. 
	public abstract void emprunter();

    // Méthode abstraite pour retourner le document.
	public abstract void retourner();

    // Méthode abstraite pour afficher les détails du document.
	public abstract void afficherDetails();

}
