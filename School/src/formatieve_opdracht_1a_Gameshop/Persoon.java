package formatieve_opdracht_1a_Gameshop;

import java.util.*; 

public class Persoon {

	private String naam;
	private double budget;
	private List<Game> games;
	
	public Persoon(String nm, double b)
	{
		naam = nm;
		budget = b;
		games = new ArrayList<Game>();
	}
	
	public String koop(Game gm)
	{
		if (gm.getHuidigePrijs() <= budget && !gameGekocht(gm.getNaam()))
		{
			budget -= gm.getHuidigePrijs();
			games.add(gm);
			return "gelukt";
		}
		
		return "niet gelukt";
	}
	
	private boolean gameGekocht(String nm)
	{
		for (Game game : games) 
		{
			if (game.getNaam() == nm)
				return true;
		}
		
		return false;
	}
	
	public String verkoop(Game g, Persoon p)
	{
		if (games.contains(g) && !p.gameGekocht(g.getNaam()))
		{
			games.remove(g);
			budget += g.getHuidigePrijs();
			p.budget -= g.getHuidigePrijs();
			p.games.add(g);
			return "gelukt";
		}

		return "niet gelukt";
	}
	
	public String toString()
	{
		System.out.println(String.format("\n%s heeft een budget van €%.2f en bezit de volgende games:", naam, budget));
		for (Game game : games) 
		{
			System.out.println(String.format("%s, uitgegeven in %d; nieuwprijs €%.2f nu voor: €%.2f", game.getNaam(), game.getReleaseJaar(), game.getNieuwPrijs(), game.getHuidigePrijs()));
		}
		return "";
	}
	
}
