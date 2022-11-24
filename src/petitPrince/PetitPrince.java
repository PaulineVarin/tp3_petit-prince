package petitPrince;

import asteroide.Sujet;
import asteroide.console.*;
import petitPrince.jeu.Joueur;

public class PetitPrince implements Sujet, Joueur{
	private String nom ;  
	private int argent ; 
	private ConsoleJavaBoy console ; 
	private int cpt ; 
	
	public PetitPrince(String nom) {
		this.nom = nom ;
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
