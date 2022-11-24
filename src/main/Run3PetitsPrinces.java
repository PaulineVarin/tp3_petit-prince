package main;

import petitPrince.PetitPrince;
//import petitPrince.PetitPrince;


public class Run3PetitsPrinces {
	
	private static void scenario0() {
		System.out.println("Creation Petit Princes 0 : \n");
		
		for (int i = 1; i <= 9; i++) {
			new PetitPrince("PP" + i);
			//la méthode run() est appelé par le serveur 
			//lorsque le petit prince est créer et qu'il se "loggue" sur la console 
		}
	}

	/*private static void scenario1() {
		System.out.println("Creation Petit Princes : \n");
		
		for (int i = 1; i <= 9; i++) {
			//new PetitPrince0("PP" + i);
		}
	}*/
	
	public static void main(String[] args) {
		System.out.println("BEGIN : Petit Prince 2 \n");
		
		scenario0();
//		scenario1();
		
		System.out.println("\nEND \n");
	}

}
