package jeu;

import cartes.Attaque;
import cartes.Carte;
import cartes.Diffamation;
import cartes.GestionnaireCartes;
import cartes.Popularite;
import personnages.Joueur;
import personnages.Nom;
import uix.Afficheur;
import uix.IAfficheur;

public class Jeu {
    private String nom;
    private Joueur joueur1 = new Joueur(Nom.BILL);
    private Joueur joueur2 = new Joueur(Nom.JACK);
    
    
    
    private boolean isTurnOfPlayer1 = true;
    
    
    private IAfficheur afficheur ; 
    
    public Jeu() {
    	afficheur = new Afficheur() ; 

	}

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void jouer() {
    	
    	
    	
    	
    	afficheur.displayInfoJoueur(joueur1.getInfo());
    	afficheur.displayInfoJoueur(joueur2.getInfo());
    	
    	
    	afficheur.startJeu() ; 
    	GestionnaireCartes trouche ;
    	do {
	        Joueur joueurActuel = isTurnOfPlayer1 ? joueur1 : joueur2;
	        Joueur adversaire = isTurnOfPlayer1 ? joueur2 : joueur1;
	        trouche = joueurActuel.getTroucheCartes() ; 
	        
	        trouche.piocherCarte() ;
	        afficheur.displayInfoJoueur(joueurActuel.getInfo());
	        afficheur.displayCarte(trouche.getInfoCartes());
	        int  choix = afficheur.choisirCarte();
	        Carte carte = trouche.choisirCarte(choix);
	        traiterCarte(carte, joueurActuel, adversaire);
	        isTurnOfPlayer1 = !isTurnOfPlayer1;
	        	
    	}
    	while(jeuContinue());
    	
    	
    	Joueur gagnant = joueur1 ;
    	if(joueur1.getVie() == 0) {
    		gagnant = joueur2 ; 
    	}

    	
    	afficheur.displayWinner(gagnant.getNom().toString()) ; 
    	 
    }

    private boolean jeuContinue() {
    	boolean continuer = true ; 
    	
    	if(joueur1.isDead() || joueur2.isDead())  {
    		continuer = false  ; 
    	}
    	
    	   	
		return continuer ;
	}

    void traiterCarte(Carte carte , Joueur joueurActuel , Joueur adversaire) {
    	boolean isDiffamation = carte instanceof Diffamation ;
    	boolean isPopularite = carte instanceof Popularite ;
    	boolean isAttaque = carte instanceof Attaque ;
    	if(isDiffamation) {
    		Diffamation cart = (Diffamation) carte ;
    		int valeur =  adversaire.getPopularite()  - cart.getPopularite() ; 
    		adversaire.setPopularite(valeur);
    	}
    	 if(isPopularite) {
    		Popularite cart = (Popularite) carte ;
    		joueurActuel.setPopularite(joueurActuel.getPopularite() + cart.getPopularite());
    	}
    	if (isAttaque) {
            adversaire.setVie(adversaire.getVie() - carte.getVie() ) ; 
        }
    }




}
