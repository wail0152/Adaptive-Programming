package domain_design_and_implementatie;

public class Medewerker extends Klant {

	private double uurloon;
	
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
