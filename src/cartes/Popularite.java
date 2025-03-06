package cartes;

public class Popularite extends Carte {
	private int popularite ; 
	
	Popularite(int popularite){
		setPopularite(popularite);
	}
	
	public int getPopularite() {
		return popularite;
	}
	
	private void setPopularite(int popularite) {
		this.popularite = popularite;
	} 
	@Override
	public String toString() {
		return super.toString() + " " + getPopularite() + " Popularité(s) " ;
		
	}
	

}
