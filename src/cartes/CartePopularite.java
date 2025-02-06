package cartes;

public class CartePopularite extends Carte {
	private int popularite ; 
	
	CartePopularite(int popularite){
		setPopularite(popularite);
	}
	
	public int getPopularite() {
		return popularite;
	}
	
	private void setPopularite(int popularite) {
		this.popularite = popularite;
	}
	
	

}
