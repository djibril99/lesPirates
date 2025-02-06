package jeu;

import cartes.Carte;
import cartes.CarteAttaque;
import cartes.CartePopularite;
import personnages.Joueur;
import personnages.Nom;

public class Jeu {
    private String nom;
    private Joueur joueur1 = new Joueur(Nom.BILL);
    private Joueur joueur2 = new Joueur(Nom.JACK);
    private boolean isTurnOfPlayer1 = true;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void jouer() {
    	
    	do {
        Joueur joueurActuel = isTurnOfPlayer1 ? joueur1 : joueur2;
        Joueur adversaire = isTurnOfPlayer1 ? joueur2 : joueur1;

        Carte carte = joueurActuel.getTroucheCartes().ChoisirCarte();

        if (carte instanceof CarteAttaque) {
            adversaire.setVie(adversaire.getVie() - carte.getVie() ) ; 
        } else if (carte instanceof CartePopularite) {
            joueurActuel.setPopularite(joueurActuel.getPopularite() + ((CartePopularite) carte).getPopularite());
        }

        isTurnOfPlayer1 = !isTurnOfPlayer1;
        
    	}
    	while(jeuContinue());
    }

    private boolean jeuContinue() {
		return !isDead(joueur1) || !isDead(joueur2) ; 
	}

	public boolean isDead(Joueur joueur) {
        return joueur.getVie() == 0;
    }
}
