public class PassworldGenertor
{
	public static String generatePassword(int longueur,int nombreDeMajuscule,int nombreDeCaratereSpeciale)
	{
		int cpt;
		String password;

		password = "";
		cpt = 0;
		while(cpt < longueur)
		{
			if(cpt < nombreDeMajuscule)
			{
				password = password + (char) (65 + (int) (Math.random() * 26));
			}
			//caratre miniscule
			else if(cpt < longueur - nombreDeCaratereSpeciale)
			{
				password = password + (char) (97 + (int) (Math.random() * 26));
			}
			else
			{
				password = password + (char) (33 + (int) (Math.random() * 15));
			}
			cpt = cpt + 1;
		}

		
		return password;
	}
}
