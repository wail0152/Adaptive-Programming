package formatieve_opdracht_1a_Gameshop;

import java.time.LocalDate;

public class Game {

	private String naam;
	private int releaseJaar;
	private double prijs;
	
	public Game(String nm, int rj, double p)
	{
		naam = nm;
		releaseJaar = rj;
		prijs = p;
	}
	
	public double getHuidigePrijs()
	{
		return prijs * (Math.pow(0.7, LocalDate.now().getYear() - releaseJaar));
	}
	
	public double getNieuwPrijs()
	{
		return prijs;
	}
	
	public String getNaam()
	{
		return naam;
	}
	
	public int getReleaseJaar()
	{
		return releaseJaar;
	}
	
}
