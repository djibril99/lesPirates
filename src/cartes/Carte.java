package cartes;

import personnages.Joueur;

public abstract class Carte {
	private int vie ; 
	
	public int getVie() {
		return vie;
	}
	public void setVie(int vie) {
		this.vie = vie;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " "+ getVie() +" vie(s)" ; 
		
	}
	public abstract void traiterCarte(Joueur joueurActuel, Joueur adversaire);
}