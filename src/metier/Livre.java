package metier;

import java.time.LocalDate;

public class Livre extends Document {

	public int ISBN;

	public Livre(int ID, String Titre, String Auteur, LocalDate DateDePublication, int NombreDePages, int isbn) {
		super(ID, Titre, Auteur, DateDePublication, NombreDePages);
		this.ISBN = isbn;
		this.type = "Livre";
	}

	@Override
	public void emprunter() {
		if (this.estEmprunte) {
			System.out.println("le Livre est déjà emprunte");
		} else {
			this.estEmprunte = true;
			System.out.println("le livre est emprunte avec succes ");

		}
	}

	@Override
	public void retourner() {
		if (this.estEmprunte) {
			this.estEmprunte = false;
			System.out.println("le Livre est retourné avec succes.");
		} else {
			System.out.println("le livre n'est pas emprunte.");

		}
	}

	@Override
	public void afficherDetails() {
		System.out.printf(
				"Type : %s , ID : %d , Titre : %s , Auteur : %s , Date de publication : %s , Nombre de pages : %d , ISBN : %d , Emprunte : %d .\n",
				this.type, this.id, this.titre, this.auteur, this.datePublication, this.nombreDePages, this.ISBN,
				this.estEmprunte);
	}

}
