package formatieve_opdracht_1a_AutoHuur;

public class Auto {
	
	private String type;
	private double prijsPerDag;
	
	public Auto(String tp, double prPd)
	{
		type = tp;
		prijsPerDag = prPd;
	}
	
	public double getPrijsPerDag()
	{
		return prijsPerDag;
	}
	
	public String toString()
	{
		return type;
	}
	
}
