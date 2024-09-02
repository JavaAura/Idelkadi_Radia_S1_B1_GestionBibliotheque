package metier;

import java.time.LocalDate;

public class Magazine extends Document {
	public int numero;

	public Magazine(int ID, String Titre, String Auteur, LocalDate DateDePublication, int NombreDePages, int Numero) {
		super(ID, Titre, Auteur, DateDePublication, NombreDePages);
		this.numero = Numero;
		this.type = "Magazine";
	}

	@Override
	public void emprunter() {
		if (this.estEmprunte) {
			System.out.println("la magazine est déjà emprunte");
		} else {
			this.estEmprunte = true;
			System.out.println("la magazine est emprunte avec succes ");

		}
	}


	@Override
	public void retourner() {
		// TODO Auto-generated method stub

	}

	@Override
	public void afficherDetails() {
		System.out.printf(
				"Type : %s , ID : %d , Titre : %s , Auteur : %s , Date de publication : %s , Nombre de pages : %d , Numero : %d  , Emprunte : %d .\n",
				this.type, this.id, this.titre, this.auteur, this.datePublication, this.nombreDePages, this.numero , this.estEmprunte);
	}

}
