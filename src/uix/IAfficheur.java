package uix;

public interface IAfficheur {
	public void displayCarte(String [] cartes) ;
	public void displayInfoJoueur(String info) ; 
	public void displayWinner(String nom) ; 
	public void startJeu() ;
	public int choisirCarte();
}
