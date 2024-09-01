package metier;

import java.time.LocalDate;

public class Magazine extends Document {
	public int numero;

	public Magazine(int ID, String Titre, String Auteur, LocalDate DateDePublication, int NombreDePages, int Numero) {
		super(ID, Titre, Auteur, DateDePublication, NombreDePages);
		this.numero = Numero;
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
