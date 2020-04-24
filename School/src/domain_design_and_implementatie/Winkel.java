package domain_design_and_implementatie;

import java.util.ArrayList;

public class Winkel {

	private String locatie;
	private String naam;
	private ArrayList<Medewerker> medewerkers = new ArrayList<Medewerker>();

	public Winkel(String newLocatie, String newNaam)
	{
		setLocatie(newLocatie);
		setNaam(newNaam);
	}
	
	public String getLocatie()
	{
		return locatie;
	}
	
	public void setLocatie(String newLocatie)
	{
		locatie = newLocatie;
	}
	
	public String getNaam()
	{
		return naam;
	}
	
	public void setNaam(String newNaam)
	{
		naam = newNaam;
	}
	
	public String getMedewerker(Medewerker medewerker)
	{
		return medewerker.toString();
	}
	
	public void setMedewerker(Medewerker medewerker)
	{
		medewerkers.add(medewerker);
	}
	
	//Returning a string in a format of the location and all the employees
	public String toString()
	{
		String returnString = locatie;
		for (Medewerker medewerker : medewerkers)
		{
			returnString += "\n" + medewerker.toString();
		}
		return returnString;
	}
	
}
