package domain_design_and_implementatie;

public class Main {

	public static void main(String[] args)
	{
		Winkel jumbo = new Winkel();
		jumbo.setLocatie("Leidsche Rijn");
		
		Medewerker wail = new Medewerker("Wail", 7.62);
		jumbo.setMedewerker(wail);
		Medewerker hans = new Medewerker("Hans", 7.51);
		jumbo.setMedewerker(hans);

		System.out.println(jumbo.toString());
		
		Klant peter = new Klant();
		peter.setNaam("Peter");
		
		Product eiren = new Product();
		eiren.setNaam("Eiren");
		eiren.setPrijs(3.52);
		
		Product melk = new Product();
		melk.setNaam("Melk");
		melk.setPrijs(2.13);
		
		peter.setProduct(eiren);
		peter.setProduct(melk);

		for (Product product : peter.getProduct())
		{
			System.out.println("Peter heeft: " + product.getNaam() + " gekocht voor " + product.getPrijs());
		}
	}
	
}
