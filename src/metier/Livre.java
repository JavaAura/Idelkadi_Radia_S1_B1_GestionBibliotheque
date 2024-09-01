package metier;

import java.time.LocalDate;

public class Livre extends Document {

	public int ISBN;

	public Livre(int ID, String Titre, String Auteur, LocalDate DateDePublication, int NombreDePages , int isbn) {
		super(ID, Titre, Auteur, DateDePublication, NombreDePages);
		this.ISBN = isbn;
	}

	@Override
	public void emprunter() {
		// TODO Auto-generated method stub

	}

	@Override
	public void retourner() {
		// TODO Auto-generated method stub

	}

	@Override
	public void afficherDetails() {
		// TODO Auto-generated method stub

	}

}
