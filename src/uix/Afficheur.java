package uix;

import java.util.Scanner;

public class Afficheur implements IAfficheur {
	@Override
	public void displayCarte(String [] cartes) {
		
		for(int i = 0 ; i< cartes.length ; i++) 
				System.out.println("\t"+i +") "+cartes[i]);
		
		
	}
	@Override
	public void displayInfoJoueur(String info) {
		System.out.println("\t#########INFO JOUEUR########## ");
		System.out.println(info);
		
	}
	@Override
	public int choisirCarte() {
		int choix  ; 
		Scanner scan = new Scanner(System.in) ;
		do {
			System.out.println("Donnez le numero de la Carte SVP :");
	
				choix =  scan.nextInt() ;
		 
		
		}
		while(choix <0 || choix >4 ) ;
		return choix ;
	}
	@Override
	public void displayWinner(String nom) {
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println(" !! BRAVO "+nom +" Vous avez gagner");
		
	}
	@Override
	public void startJeu() {
		System.out.println("----------------------------"
				+ " A VOS MARQUE ! LE JEU DEBUTE !!!!!!!"
				+ "----------------------------") ; 
	}
	
}
