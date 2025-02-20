package personnages;

import cartes.GestionnaireCartes;

public class Joueur {
	private Nom nom ;
	
	private int vie = 5 ; 
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
		// TODO Auto-generated method stub
		return nom.toString() ; 
	}

	public boolean isDead() {
		// TODO Auto-generated method stub
		return getVie() == 0  ||  getPopularite() >= 5  ; 
	}
	
	
	
	

}
