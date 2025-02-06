package cartes;

import java.util.Random;

public abstract class Carte {
	private int vie ; 
	
	public int getVie() {
		return vie;
	}
	public void setVie(int vie) {
		this.vie = vie;
	}
	
	public static Carte CreateCarte() {
		Random random = new Random();
        int choix = random.nextInt(3); // Génère un nombre entre 0 et 2
        Carte carte = null ; 

        switch (choix) {
            case 0:
            	carte =  new CarteAttaque();
            case 1:
            	carte =  new CartePopularite(2) ;
            case 2:
            	carte =  new CarteSpecial() ; 
        }
		
		
		return carte ; 
		
	
	}

}
