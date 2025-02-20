package jeu;

import java.util.Scanner;

import cartes.Carte;
import cartes.CarteAttaque;
import cartes.CartePopularite;
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
    	
    	do {
	        Joueur joueurActuel = isTurnOfPlayer1 ? joueur1 : joueur2;
	        Joueur adversaire = isTurnOfPlayer1 ? joueur2 : joueur1;
	        
	        joueurActuel.getTroucheCartes().piocherCarte() ;
	     
	        afficheur.displayInfoJoueur(joueurActuel.getInfo());
	
	        afficheur.displayCarte(joueurActuel.getTroucheCartes().getInfoCartes());
	        Scanner  scan = new Scanner(System.in);
	        
	        int choix = scan.nextInt() ; 
	        Carte carte = joueurActuel.getTroucheCartes().ChoisirCarte(choix);
	        if(carte == null) {
	        	System.out.println("ERREUR CHOISIR UNE BONNE VALEUR !!!!");
	        	continue ;
	        }
	        else if (carte instanceof CarteAttaque) {
	            adversaire.setVie(adversaire.getVie() - carte.getVie() ) ; 
	        } else if (carte instanceof CartePopularite) {
	            joueurActuel.setPopularite(joueurActuel.getPopularite() + ((CartePopularite) carte).getPopularite());
	        }
	        
	        
	
	        isTurnOfPlayer1 = !isTurnOfPlayer1;
	        	
    	}
    	while(jeuContinue());
    	
    	
    	Joueur gagnant = null ;
    	
    	if(joueur1.getVie() == 0) {
    		gagnant = joueur2 ; 
    	}
    	else if (joueur2.getVie() == 0){
    		gagnant = joueur1 ;  	
    	}
    	
    	afficheur.displayWinner(gagnant.getNom().toString()) ; 
    	 
    }

    private boolean jeuContinue() {
    	boolean continuer = true ; 
    	
    	if(joueur1.isDead())  {
    		continuer = false  ; 
    	}
    	else if (joueur2.isDead()){
    		continuer = false  ;  	
    	}
    	   	
		return continuer ;
	}
    



}
