package domain_design_and_implementatie;

public interface Persoon {

	//2 functions to get and set the name for employee, customer and product
	public String getNaam();
	public void setNaam(String newNaam);
	public Winkel getWinkel();
	public void setWinkel(Winkel newWinkel);
}
