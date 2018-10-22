
public class Main {

	public static void main(String[] args) {
		
		Rennschnecke s1 = new Rennschnecke("Hasi", "Glitscho",3);
		Rennschnecke s2 = new Rennschnecke("Baerchen", "Rasanto",5);
		
		Rennen bilsterBerg = new Rennen("Bilster Berg",12);
		
		bilsterBerg.addRennschnecke(s1);
		bilsterBerg.addRennschnecke(s2);
		

		s1.krieche();
		System.out.println(s1);
		s1.krieche();
		System.out.println(s1);
	}

}
