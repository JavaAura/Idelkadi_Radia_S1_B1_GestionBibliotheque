package metier;

import java.time.LocalDate;

public class Magazine extends Document {
	private int numero;

	public Magazine(int ID, String Titre, String Auteur, LocalDate DateDePublication, int NombreDePages, int Numero) {
		super(ID, Titre, Auteur, DateDePublication, NombreDePages);
		this.numero = Numero;
	}

	@Override
	public void emprunter() {
		if (this.estEmprunte) {
			System.out.println("Le magazine " + this.titre + " est déjà emprunté.");
		} else {
			this.estEmprunte = true;
			System.out.println("Le magazine " + this.titre + " a été emprunté.");

		}
	}

	@Override
	public void retourner() {
		if (this.estEmprunte) {
			this.estEmprunte = false;
			System.out.println("Le magazine " + this.titre + " a été retourné.");
		} else {
			System.out.println("Le magazine " + this.titre + " n'est pas emprunté.");

		}
	}

	@Override
	public void afficherDetails() {
		System.out.printf(
				"Magazine [ ID : %d , Titre : %s , Auteur : %s , Date de publication : %s , Nombre de pages : %d , Numero : %d  , Emprunte : %b .]\n",
				this.id, this.titre, this.auteur, this.datePublication, this.nombreDePages, this.numero,
				this.estEmprunte);
	}

}
