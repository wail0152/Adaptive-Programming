package formatieve_opdracht_1a_AutoHuur;

public class AutoHuur {

	private Klant klant;
	private Auto auto;
	private int aantalDagen;
	
	public void setAantalDagen(int aD)
	{
		aantalDagen = aD;
	}
	
	public void setGehuurdeAuto(Auto gA)
	{
		auto = gA;
	}
	
	public Auto getGehuurdeAuto()
	{
		return auto;
	}
	
	public void setHuurder(Klant k)
	{
		klant = k;
	}
	
	public String toString() 
	{
		String autoTekst = (auto == null) ? "er is geen auto bekend\n" : String.format("autotype: %s met prijs per dag: %.2f \n", auto.toString(), auto.getPrijsPerDag());
		String klantTekst = (klant == null) ? "er is geen huurder bekend\n" : String.format("op naam van: %s (korting: %.2f%s)\n", klant.toString(), klant.getKorting(), "%");
		double prijs = (auto == null) ? 0 : aantalDagen * auto.getPrijsPerDag();
		double kortingPrijs = (klant == null) ? prijs : prijs * (1 - klant.getKorting() / 100);
		String dagenTekst = String.format("aantal dagen: %d en dat kost %.2f\n", aantalDagen, kortingPrijs);
		return autoTekst + klantTekst + dagenTekst;
	}
	
}
