package metier;

import java.time.LocalDate;

public abstract class Document {

	protected int id;
	protected String titre;
	protected String auteur;
	protected LocalDate datePublication;
	protected int nombreDePages;

	public Document(int ID, String Titre, String Auteur, LocalDate DateDePublication, int NombreDePages) {
		this.id = ID;
		this.titre = Titre;
		this.auteur = Auteur;
		this.datePublication = DateDePublication;
		this.nombreDePages = NombreDePages;
	}

	public abstract void emprunter();

	public abstract void retourner();

	public abstract void afficherDetails();

}
