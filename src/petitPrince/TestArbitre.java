package petitPrince;
import jeu.JeuDe;
import jeu.JeuSimple;

public class TestArbitre{
	
	public static void arbitrer(Joueur j1, Joueur j2, JeuSimple jeu) {
		String resJ1 = jeu.jouerUnTour() ; 
		System.out.println("J1 JOUE : "+resJ1);
		String resJ2 = jeu.jouerUnTour() ; 
		System.out.println("J2 JOUE : "+resJ2);
		
		int res = jeu.arbitrer(resJ1, resJ2) ; 
		
		if (res==0) {
			System.out.println("Egalité") ; 
		}
		else if (res==1) {
			System.out.println("Joueur 2 gagne") ;
			j1.perdre(10);
			j2.gagner(5);
		}
		else {
			System.out.println("Joueur 1 gagne") ; 
			j1.gagner(5);
			j2.perdre(10);
		}
	}
	
	/*public static void main(String[] args) {
		System.out.println("Jouons au jeu de dés");
		JeuSimple jeu = new JeuDe() ; 
		TestArbitre arbitre = new TestArbitre() ; 
		arbitre.arbitrer(null, null, jeu);
		
		
	} */
	
}
