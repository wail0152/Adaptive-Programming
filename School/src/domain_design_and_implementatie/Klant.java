package domain_design_and_implementatie;

import java.util.ArrayList;

public class Klant implements Persoon {

	private String naam;
	private Winkel winkel;
	private ArrayList<Product> producten = new ArrayList<Product>();
	
	public Klant(String newNaam, Winkel newWinkel)
	{
		naam = newNaam;
		winkel = newWinkel;
	}
	
	public ArrayList<Product> getProduct()
	{
		return producten;
	}
	
	public void setProduct(Product product)
	{
		producten.add(product);
	}
	
	@Override
	public String getNaam() {
		return naam;
	}

	@Override
	public void setNaam(String newNaam) {
		naam = newNaam;
	}

	@Override
	public Winkel getWinkel() {
		return winkel;
	}

	@Override
	public void setWinkel(Winkel newWinkel) {
		winkel = newWinkel;
	}
	
}
