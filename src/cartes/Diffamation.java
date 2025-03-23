package cartes;

import personnages.Joueur;

public class Diffamation extends Popularite {

	Diffamation(int popularite) {
		super(popularite);
	}
	@Override
	public void traiterCarte( Joueur joueurActuel, Joueur adversaire) {
        adversaire.setPopularite(adversaire.getPopularite() - getPopularite());
        joueurActuel.setPopularite(joueurActuel.getPopularite() + getPopularite());
    }

}
