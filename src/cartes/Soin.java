package cartes;

import personnages.Joueur;

public class Soin extends Carte {
	public Soin(int vie) {
		setVie(vie);
	}
	@Override
	public void traiterCarte( Joueur joueurActuel, Joueur adversaire) {
        adversaire.setVie(adversaire.getVie() + getVie());
       
    }
}
