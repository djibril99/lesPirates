package cartes;

import java.util.Random;

public class GestionnaireCartes {
	
	public static final int NOMBRECARTEMAX = 5;
	private static final int NOMBRECARTEGERER = 3 ;
	private static final int VALEURCARTEMIN = 1 ;
	private static final int VALEURCARTEMAX = 4 ;
	
	private Carte [] cartes = new Carte[NOMBRECARTEMAX] ; 
	private int nombreCarte = 0 ;
	
	private Random random = new Random();
	
	public GestionnaireCartes() {
		for (int i = 0 ; i<NOMBRECARTEMAX-1; i++) {
			piocherCarte() ; 
		}
	}

	public Carte choisirCarte(int choix) {
		Carte carte = null ;
		if(choix>=0 && choix < nombreCarte) {
			carte = cartes[choix] ; 
			cartes[choix]=null ;
			nombreCarte-=1 ;
		}
		
		return carte ; 
		
	}
	
	public void  piocherCarte() {
		int totalCarte = this.nombreCarte + 1 ; 
		boolean continuer = true ; 
		for(int i = 0 ; i < totalCarte && continuer  ; i++)
		{	
			if(cartes[i] == null)
			{
				cartes[i] = genererCarte() ; 
				continuer = false ;
				
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

		
        int choix = random.nextInt(NOMBRECARTEGERER);
        int valeur  = random.nextInt(VALEURCARTEMIN,VALEURCARTEMAX) ; 
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
	
