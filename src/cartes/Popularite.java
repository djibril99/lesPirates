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
			if(this.popularite>0) {
				this.popularite = popularite;
			}
			else {
				this.popularite = 0 ;
			}
	} 
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " " + getPopularite() + " Popularité(s) " ;
	}
	

}
