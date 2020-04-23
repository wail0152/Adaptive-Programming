package domain_design_and_implementatie;

public class Main {

	public static void main(String[] args)
	{		
		Winkel jumbo = new Winkel("Leidsche Rijn");

		Medewerker wail = new Medewerker("Wail", 7.62, jumbo);
		Medewerker hans = new Medewerker("Hans", 7.51, jumbo);
		jumbo.setMedewerker(wail);
		jumbo.setMedewerker(hans);

		System.out.println(jumbo.toString());
		
		Klant peter = new Klant("Peter", jumbo);
		
		Product eiren = new Product("Eiren", 3.52);
		Product melk = new Product("Melk", 2.13);
		
		peter.setProduct(eiren);
		peter.setProduct(melk);

		for (Product product : peter.getProduct())
		{
			System.out.println("Peter heeft: " + product.getNaam() + " gekocht voor " + product.getPrijs());
		}
	}
	
}
