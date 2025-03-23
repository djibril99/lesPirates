package cartes;

import personnages.Joueur;

public class Attaque extends Carte{

	public Attaque(int vie) {
		this.setVie(vie);
	}
	@Override
	public void traiterCarte( Joueur joueurActuel, Joueur adversaire) {
    adversaire.setVie(adversaire.getVie() - getVie());
	}
}
