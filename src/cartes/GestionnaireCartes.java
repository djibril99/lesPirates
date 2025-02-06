package cartes;

import java.util.Random;

import personnages.Joueur;

public class GestionnaireCartes {
	
	private static final int nombreCarteMax = 5;
	
	private Carte [] cartes = new Carte[nombreCarteMax] ; 
	private int nombreCarte = 0 ;
	
	public GestionnaireCartes() {
		
		for (int i = 0 ; i<4 ; i++) {
			piocherCarte(4) ; 
		}
		
	}

	public Carte ChoisirCarte(Joueur joueur) {
		//afficher la liste de carte chisir une carteet choisire une numero de cartre
		System.out.println(joueur +  " Choisi une carte ");
		
		
		
		return null ; 
	}
	
	private Carte getCarte(int index) {
		return cartes[index] ; 
	}
	
	
	public void  piocherCarte(int nombre) {
		
		int totalCarte = this.nombreCarte + nombre ; 
		
		if(totalCarte > nombreCarteMax ) {
			return ; 
		}
		
		for(int i = nombreCarte ; i < totalCarte ; i++)
)		{	
			//choisir une carte de manier aleatoire
			 cartes[i] = Carte.CreateCarte() ; 
		}
		
		this.nombreCarte = totalCarte ;
		
	}
	
}
