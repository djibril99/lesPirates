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
            {
            	int vie  = random.nextInt(5) ; 
            	carte =  new CarteAttaque(vie);
            	
            	break ;
            }
            case 1:
            {
            	int popularite = random.nextInt(5);
            	carte =  new CartePopularite(popularite) ;
            	break ;
            }
            case 2:
            	carte =  new CarteSpecial() ; 
        }
		
		
		return carte ; 
		
	
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " "+ getVie() +" vie(s)" ; 
		
	}
	
	

}
