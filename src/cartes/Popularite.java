package cartes;

import personnages.Joueur;

public class Popularite extends Carte {
	private int popularite ; 
	
	Popularite(int popularite){
		setPopularite(popularite);
	}
	
	public int getPopularite() {
		return popularite;
	}
	
	private void setPopularite(int popularite) {
			
			this.popularite = popularite;
			
			if(this.popularite<0) {
				this.popularite = 0 ;
			}
	} 
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " " + getPopularite() + " Popularité(s) " ;
	}
	@Override
	public void traiterCarte( Joueur joueurActuel, Joueur adversaire) {
        joueurActuel.setPopularite(joueurActuel.getPopularite() + getPopularite());
    }

}
