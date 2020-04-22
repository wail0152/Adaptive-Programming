package domain_design_and_implementatie;

import java.util.ArrayList;

public class Klant implements Naam{

	private String naam;
	private ArrayList<Product> producten = new ArrayList<Product>();
	private Winkel winkel;
	
	public ArrayList<Product> getProduct()
	{
		return producten;
	}
	
	public void setProduct(Product product)
	{
		producten.add(product);
	}
	
	public Winkel getWinkel() {
		return winkel;
	}

	public void setWinkel(Winkel newWinkel) {
		winkel = newWinkel;
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
