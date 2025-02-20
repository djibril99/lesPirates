package uix;




public class Afficheur implements IAfficheur {
	
	public void displayCarte(String [] cartes) {
		//System.out.println("\t-La liste des Cartes :");
		for(int i = 0 ; i< cartes.length ; i++) {
				System.out.println("\t"+i +") "+cartes[i]);
		}
		
	}
	public void displayInfoJoueur(String info) {
		System.out.println("\t#########INFO JOUEUR########## ");
		System.out.println(info);
		
	}
	public void displayWinner(String nom) {
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println(" !! BRAVO "+nom +" Vous avez gagner");
		
	}
	public void startJeu() {
		System.out.println("----------------------------"
				+ " A VOS MARQUE ! LE JEU DEBUTE !!!!!!!"
				+ "----------------------------") ; 
	}
	
}
