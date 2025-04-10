package personnages;

import cartes.GestionnaireCartes;

public class Joueur {
	private Nom nom ;
	
	private int vie = 5 ; 
	private int popularite=0 ; 
	
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
		
		if(vie < 0) {
			vie = 0 ;
		}
		
		this.vie = vie;
	}
	public int getPopularite() {
		return popularite;
	}
	public void setPopularite(int popularite) {
		this.popularite = popularite;
		if(this.popularite<0) {
			this.popularite = 0 ;
		}
	}
	
	public GestionnaireCartes getTroucheCartes() {
		return troucheCartes;
	}
 
	public String getInfo() {
		String info  = toString() +"\n" ; 
		info +=  " -  " + getVie() + " Vie(s) \n" +
				" -  " + getPopularite()+ " Popularité(s) \n" +
				" -  " + troucheCartes.getNombreCarte() + " Cartes"  ; 
		return info ; 
	}
	
	@Override
	public String toString() {
		return nom.toString() ; 
	}

	public boolean isDead() {
		return getVie() == 0  ||  getPopularite() >= 5  ; 
	}
	
	
	
	

}
