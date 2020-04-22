package domain_design_and_implementatie;

public class Product implements Naam {

	private String naam;
	private double prijs;
	
	public double getPrijs()
	{
		return prijs;
	}
	
	public void setPrijs(double newPrijs)
	{
		prijs = newPrijs;
	}
	
	@Override
	public String getNaam() {
		return naam;
	}

	@Override
	public void setNaam(String newNaam) {
		naam = newNaam;
	}	
	
}
