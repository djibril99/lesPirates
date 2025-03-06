package cartes;

public abstract class Carte {
	private int vie ; 
	
	public int getVie() {
		return vie;
	}
	public void setVie(int vie) {
		this.vie = vie;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " "+ getVie() +" vie(s)" ; 
		
	}
	
	

}
