import iut.algo.*;

public class main
{
	public static void main()
		{
		int longueur;
		int nombreDeMajuscule;
		int nombreDeCaratereSpeciale;

		System.out.println("Entrer une longueur de mot de passe");
		longueur = Clavier.lire_int();
		if(longueur > 0)
		{
			System.out.println("Entrer le nombre de majuscule");
			nombreDeMajuscule = Clavier.lire_int();
			if (nombreDeMajuscule > 0 && nombreDeMajuscule <= longueur -1)
			{
				System.out.println("Entrer le nombre de caratere special");
				nombreDeCaratereSpeciale = Clavier.lire_int();
				

			}


		}
		
	}
}