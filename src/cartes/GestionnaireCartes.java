package cartes;


public class GestionnaireCartes {
	
	private static final int nombreCarteMax = 5;
	
	private Carte [] cartes = new Carte[nombreCarteMax] ; 
	private int nombreCarte = 0 ;
	
	public GestionnaireCartes() {
		
		for (int i = 0 ; i<4 ; i++) {
			piocherCarte() ; 
		}
		
	}

	public Carte ChoisirCarte(int choix) {
		//afficher la liste de carte chisir une carteet choisire une numero de cartre
		Carte carte = null ;
		if(choix>=0 & choix < nombreCarte) {
			carte = cartes[choix] ; 
			nombreCarte-=1 ;
		}
		
		cartes[choix]=null ; 
		
		
		return carte ; 
		
	}
	
	
	//piocher un nombre de carte bien precis sans depassser la limite
	public void  piocherCarte() {
		
		Carte newCarte  = Carte.CreateCarte() ;
		
		
		
		int totalCarte = this.nombreCarte + 1 ; 
		
		

		
		//rangement des carte
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
		Carte[] cartes = getCartes();
		String[] infosCartes = new String[cartes.length] ; 
		for(int i = 0 ; i<cartes.length ; i++ ) {
			if(cartes[i]!=null) {
				infosCartes[i] = cartes[i].toString() ; 
			}
		}
		return infosCartes ;
		
	}
	
}
	
