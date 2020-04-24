package domain_design_and_implementatie;

public class Klant implements Persoon {

	private String naam;
	private Winkel winkel;
	private Zelfscanner zelfscanner;
	
	public Klant(String newNaam, Winkel newWinkel, Zelfscanner newZelfscanner)
	{
		setNaam(newNaam);
		setWinkel(newWinkel);
		setZelfscanner(newZelfscanner);
		zelfscanner.setKlant(this);
	}
	
	public Zelfscanner getZelfscanner()
	{
		return zelfscanner;
	}
	
	public void setZelfscanner(Zelfscanner newZelfscanner)
	{
		zelfscanner = newZelfscanner;
	}
	
	public String toString()
	{
		return getWinkel().getNaam() + "/" + getNaam();
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
