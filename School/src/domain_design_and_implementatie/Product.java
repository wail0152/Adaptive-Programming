package domain_design_and_implementatie;

public class Product {

	private String naam;
	private double prijs;
	
	public Product(String newNaam, double newPrijs)
	{
		naam = newNaam;
		prijs = newPrijs;
	}
	
	public double getPrijs()
	{
		return prijs;
	}
	
	public void setPrijs(double newPrijs)
	{
		prijs = newPrijs;
	}
	
	public String getNaam() {
		return naam;
	}

	public void setNaam(String newNaam) {
		naam = newNaam;
	}	
	
}
