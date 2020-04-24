package domain_design_and_implementatie;

import java.util.ArrayList;

public class Zelfscanner {

	private Klant klant;
	private ArrayList<Product> producten = new ArrayList<Product>();
	
	public Klant getKlant()
	{
		return klant;
	}
	
	public void setKlant(Klant newKlant) 
	{
		klant = newKlant;
	}

	public ArrayList<Product> getProduct()
	{
		return producten;
	}
	
	public void setProduct(Product product)
	{
		producten.add(product);
	}
	
	public String toString()
	{
		String returnString = "\n" + getKlant().getNaam();
		for (Product product : getProduct())
		{
			returnString += "\n" + product.toString();
		}
		return returnString;
	}
	
}
