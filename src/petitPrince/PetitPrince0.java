package petitPrince;

import asteroide.Sujet;
import asteroide.console.*;

public class PetitPrince0 implements Sujet, Joueur{
	private String nom ;  
	private int argent ; 
	private ConsoleJavaBoy console ; 
	private int cpt ; 
	
	public PetitPrince0() {
		this.nom = "Petit prince non joueur" ;
		this.argent = 100 ; 
		this.cpt = 0 ; 
		this.console = new ConsoleJavaBoy(this) ;
		
	}
	
	public String getNom() {
		return this.nom ; 
	}
	
	public int getArgent() {
		return this.argent ; 
	}
	
	public void run() {
		this.cpt++ ; 
		this.console.parler("[tour"+cpt+"] "+ " Dessine moi un mouton");
		this.console.seDirigerVers(0);
	}

	@Override
	public void gagner(int argent) {
		this.argent = getArgent() + argent ; 
		
	}

	@Override
	public void perdre(int argent) {
		this.argent = getArgent() - argent ; 
		
	}
	
	

}
