
public class Main {

	public static void main(String[] args) {
		
		Rennschnecke s1 = new Rennschnecke("Hasi", "Glitscho",3);
		Rennschnecke s2 = new Rennschnecke("Baerchen", "Rasanto",5);

		s1.krieche();
		System.out.println(s1);
		s1.krieche();
		System.out.println(s1);
	}

}
