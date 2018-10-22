import java.util.ArrayList;
public class Rennen {

	String name;
	int teilnehmerzahl;
	float laenge;
	
	ArrayList<Rennschnecke> teilnehmer = new ArrayList<Rennschnecke>();
	
	public Rennen(String name, float laenge){
		this.name=name;
		this.laenge=laenge;
	}
	
	void addRennschnecke(Rennschnecke neueSchnecke){
		teilnehmer.add(neueSchnecke);
	}
	
	
	
	void removeRennschnecke(Rennschnecke schnecke){
		for(Rennschnecke schnegge : teilnehmer){
	//		if(teilnehmer == schnecke){
		//		schnegge.remove;
			}
		}
	}
}
