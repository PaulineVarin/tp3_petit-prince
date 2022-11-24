package jeu;

import java.util.Random;
import java.util.random.*;

public class JeuDe extends JeuSimple {
	
	private Random random = new Random() ;

	public JeuDe() {
		super() ; 
	}
	
	@Override
	public int arbitrer(String c1, String c2) { 
		//le gagnant est le plus grand nombre passé en paramètres
		
		int c1Cast = (int) Integer.valueOf(c1) ; 
		int c2Cast = (int) Integer.valueOf(c2) ; 
		
		if (c1Cast<c2Cast) {
			return 1 ; 
		} 
		else if (c1Cast>c2Cast) {
			return -1 ; 
		}
		else {
			return 0 ; 
		}

	}

	@Override
	public String jouerUnTour() {
		String s = "" ;
		int resRandom = random.nextInt(1,7); 
		s += resRandom ; 
		return s ; 
	}
	

}
