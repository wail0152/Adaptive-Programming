package domain_design_and_implementatie;

public class Medewerker extends Klant {

	private double uurloon;
	
	//Constructor for making a employee to set it's name and hourly wage
	public Medewerker(String newNaam, double newUurloon)
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
	
}
