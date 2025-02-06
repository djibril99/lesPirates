package personnages;

import cartes.Carte;
import cartes.GestionnaireCartes;

public class Joueur {
	private Nom nom ;
	
	private int vie = 3 ; 
	private int popularite ; 
	
	private GestionnaireCartes troucheCartes ; 
	
	
	public Joueur(Nom nom ) {
		
		setNom(nom);
		troucheCartes = new GestionnaireCartes() ; 
		
	}
	
	public Nom getNom() {
		return nom;
	}
	public void setNom(Nom nom) {
		this.nom = nom;
	}
	public int getVie() {
		return vie;
	}
	public void setVie(int vie) {
		this.vie = vie;
	}
	public int getPopularite() {
		return popularite;
	}
	public void setPopularite(int popularite) {
		this.popularite = popularite;
	}
	
	public GestionnaireCartes getTroucheCartes() {
		return troucheCartes;
	}
	
	
	
	
	
	

}
