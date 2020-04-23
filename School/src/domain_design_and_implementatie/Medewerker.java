package domain_design_and_implementatie;

public class Medewerker implements Persoon {

	private String naam;
	private double uurloon;
	private Winkel winkel;

	//Constructor for making a employee to set it's name and hourly wage
	public Medewerker(String newNaam, double newUurloon, Winkel newWinkel)
	{
		setNaam(newNaam);
		setUurloon(newUurloon);
	}
	
	public double getUurloon()
	{
		return uurloon;
	}
	
	public void setUurloon(double newUurloon)
	{
		uurloon = newUurloon;
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
