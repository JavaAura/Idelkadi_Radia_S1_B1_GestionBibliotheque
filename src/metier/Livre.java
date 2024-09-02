package metier;

import java.time.LocalDate;

public class Livre extends Document {

	public int ISBN;

	public Livre(int ID, String Titre, String Auteur, LocalDate DateDePublication, int NombreDePages , int isbn) {
		super(ID, Titre, Auteur, DateDePublication, NombreDePages);
		this.ISBN = isbn;
		this.type= "Livre";
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
		      System.out.printf("Type : %s , ID : %d , Titre : %s , Auteur : %s , Date de publication : %s , Nombre de pages : %d , ISBN : %d .", this.type , this.id , this.titre, this.auteur , this.datePublication , this.nombreDePages , this.ISBN);	    
	}

}
