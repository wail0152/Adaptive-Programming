package domain_design_and_implementatie;

public class Main {

	public static void main(String[] args)
	{		
		Winkel jumbo = new Winkel("Leidsche Rijn", "Jumbo");

		Medewerker wail = new Medewerker("Wail", 7.62, jumbo);
		Medewerker hans = new Medewerker("Hans", 7.51, jumbo);
		jumbo.setMedewerker(wail);
		jumbo.setMedewerker(hans);

		System.out.println(jumbo.toString());
		
		Zelfscanner zelfscanner = new Zelfscanner();
		Klant peter = new Klant("Peter", jumbo, zelfscanner);
		
		System.out.println("\n" + peter.toString());
		
		Product eiren = new Product("Eiren", 3.52);
		Product melk = new Product("Melk", 2.13);
		
		zelfscanner.setProduct(eiren);
		zelfscanner.setProduct(melk);

		System.out.println(zelfscanner.toString());
	}
	
}
