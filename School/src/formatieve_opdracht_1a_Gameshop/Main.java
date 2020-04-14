package formatieve_opdracht_1a_Gameshop;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args)
	{
		int releaseJaar1 = LocalDate.now().getYear() - 1; // 1 jaar geleden
		int releaseJaar2 = LocalDate.now().getYear() - 2; // 2 jaar geleden
		
		Game g1 = new Game("Just Cause 3", releaseJaar1, 49.98);
		Game g2 = new Game("Need for Speed: Rivals", releaseJaar2, 45.99);
		Game g3 = new Game("Need for Speed: Rivals", releaseJaar2, 45.99);
		
		Persoon p1 = new Persoon("Eric", 200);
		Persoon p2 = new Persoon("Hans", 55);
		Persoon p3 = new Persoon("Arno", 185);
		
		System.out.println("p1 koopt g1: " + p1.koop(g1));
		System.out.println("p1 koopt g2: " + p1.koop(g2));
		System.out.println("p1 koopt g3: " + p1.koop(g3));
		System.out.println("p2 koopt g2: " + p2.koop(g2));
		System.out.println("p2 koopt g1: " + p2.koop(g1));
		System.out.println("p3 koopt g3: " + p3.koop(g3));
		
		p1.toString();
		p2.toString();
		p3.toString();
		
		System.out.println("\np1 verkoopt g1 aan p3: " + p1.verkoop(g1, p3));
		System.out.println("p2 verkoopt g2 aan p3: " + p2.verkoop(g2, p3));
		System.out.println("p2 verkoopt g1 aan p1: " + p2.verkoop(g1, p1));
		
		p1.toString();
		p2.toString();
		p3.toString();
	}
	
}
