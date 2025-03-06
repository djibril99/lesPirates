package cartes;

import java.util.Random;

public class GestionnaireCartes {
	
	private static final int NOMBRECARTEMAX = 5;
	
	private Carte [] cartes = new Carte[NOMBRECARTEMAX] ; 
	private int nombreCarte = 0 ;
	Random random = new Random();
	
	public GestionnaireCartes() {
		for (int i = 0 ; i<4 ; i++) {
			piocherCarte() ; 
		}
	}

	public Carte choisirCarte(int choix) {
		Carte carte = null ;
		if(choix>=0 && choix < nombreCarte) {
			carte = cartes[choix] ; 
			nombreCarte-=1 ;
		}
		
		cartes[choix]=null ; 
		
		
		return carte ; 
		
	}
	
	public void  piocherCarte() {
		
		Carte newCarte  = genererCarte() ;
		
		
		
		int totalCarte = this.nombreCarte + 1 ; 
	
		for(int i = 0 ; i < totalCarte  ; i++)
		{	
			if(cartes[i] == null)
			{
				cartes[i] = newCarte ;  
				break  ;
			}
			
		}
		this.nombreCarte = totalCarte ;
		
	}
	public int getNombreCarte() {
		return nombreCarte;
	}

	public Carte[] getCartes() {
		return cartes ;
	}
	public String[] getInfoCartes() {
		String[] infosCartes = new String[cartes.length] ; 
		for(int i = 0 ; i<cartes.length ; i++ ) {
			if(cartes[i]!=null) {
				infosCartes[i] = cartes[i].toString() ; 
			}
		}
		return infosCartes ;
		
	}
	private  Carte genererCarte() {
		
        int choix = random.nextInt(3);
        int valeur  = random.nextInt(5) ;
        Carte carte = null ; 

        switch (choix) {
            case 0:
            { 
            	carte =  new Attaque(valeur);
            	
            	break ;
            }
            case 1:
            {
            	carte =  new Popularite(valeur) ;
            	break ;
            }
            case 2:
            	carte =  new Diffamation(valeur) ; 
            	break ; 
            default:
            	carte =  new Popularite(valeur) ;
        }
		
		
		return carte ; 
		
	
	}
	
}
	
