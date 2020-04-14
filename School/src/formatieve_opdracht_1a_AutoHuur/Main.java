package formatieve_opdracht_1a_AutoHuur;

public class Main {

	public static void main(String[] args)
	{
		AutoHuur ah1 = new AutoHuur();
		System.out.println("Eerste autohuur:\n" + ah1.toString());
		
		Klant k = new Klant("Mijnheer de Vries");
		k.setKorting(10.0);
		ah1.setHuurder(k);
		System.out.println("Eerste autohuur:\n" + ah1.toString());
		
		Auto a1 = new Auto("Peugeot 207", 50);
		ah1.setGehuurdeAuto(a1);
		ah1.setAantalDagen(4);
		System.out.println("Eerste autohuur:\n" + ah1.toString());
		
		AutoHuur ah2 = new AutoHuur();
		Auto a2 = new Auto("Ferrari", 3500);
		ah2.setGehuurdeAuto(a2);
		ah2.setHuurder(k);
		ah2.setAantalDagen(1);
		System.out.println("Tweede autohuur: " + ah2.toString());

		System.out.println("Gehuurd: " + ah1.getGehuurdeAuto() + " met de prijs per dag: " + ah1.getGehuurdeAuto().getPrijsPerDag());
		System.out.println("Gehuurd: " + ah2.getGehuurdeAuto() + " met de prijs per dag: " + ah2.getGehuurdeAuto().getPrijsPerDag());
	}
	
}
