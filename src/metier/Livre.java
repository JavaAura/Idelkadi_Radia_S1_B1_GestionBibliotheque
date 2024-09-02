package metier;

import java.time.LocalDate;

public class Livre extends Document {

	private int ISBN;

	public Livre(int ID, String Titre, String Auteur, LocalDate DateDePublication, int NombreDePages, int isbn) {
		super(ID, Titre, Auteur, DateDePublication, NombreDePages);
		this.ISBN = isbn;
	}

	@Override
	public void emprunter() {
		if (this.estEmprunte) {
			System.out.println("Le livre " + this.titre + " est déjà emprunté.");
		} else {
			this.estEmprunte = true;
			System.out.println("Le livre " + this.titre + " a été emprunté.");

		}
	}

	@Override
	public void retourner() {
		if (this.estEmprunte) {
			this.estEmprunte = false;
		    System.out.println("Le livre " + this.titre + " a été retourné.");
		} else {
		    System.out.println("Le livre " + this.titre + " n'est pas emprunté.");

		}
	}
	
	
	

	@Override
	public void afficherDetails() {
		System.out.printf(
				"Livre : [ ID : %d , Titre : %s , Auteur : %s , Date de publication : %s , Nombre de pages : %d , ISBN : %d , Emprunte : %b .]\n",
				 this.id, this.titre, this.auteur, this.datePublication, this.nombreDePages, this.ISBN,
				this.estEmprunte);
	}

}
