package formatieve_opdracht_1a_AutoHuur;

public class Klant {

	private String naam;
	private double kortingsPercentage;
	
	public Klant(String nm)
	{
		naam = nm;
	}
	
	public void setKorting(double kp)
	{
		kortingsPercentage = kp;
	}
	
	public double getKorting()
	{
		return kortingsPercentage;
	}
	
	public String toString()
	{
		return naam;
	}
	
}
