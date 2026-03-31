/**
 * Testklasse: Erstellt zwei Rennschnecken, meldet sie für ein Rennen an
 * und lässt eine von ihnen zweimal kriechen.
 *
 * <p>Dieses Programm zeigt, wie Objekte verschiedener Klassen zusammenarbeiten:
 * {@link Rennschnecke}-Objekte werden in einem {@link Rennen}-Objekt verwaltet.</p>
 *
 * @author hibbes
 */
public class Main {

    /**
     * Erstellt Schnecken und Rennen, führt zwei Kriech-Schritte durch.
     *
     * @param args Kommandozeilenargumente (nicht verwendet)
     */
    public static void main(String[] args) {

        // Zwei Rennschnecken erstellen: (Name, Rasse, Höchstgeschwindigkeit)
        Rennschnecke s1 = new Rennschnecke("Hasi",    "Glitscho", 3);
        Rennschnecke s2 = new Rennschnecke("Baerchen", "Rasanto",  5);

        // Rennen auf dem Bilster Berg, Streckenlänge 12 Einheiten
        Rennen bilsterBerg = new Rennen("Bilster Berg", 12);

        // Schnecken für das Rennen anmelden (in der ArrayList gespeichert)
        bilsterBerg.addRennschnecke(s1);
        bilsterBerg.addRennschnecke(s2);

        // Schnecke s1 zweimal kriechen lassen und Zustand ausgeben
        s1.krieche();
        System.out.println("Nach Runde 1:");
        System.out.println(s1);   // ruft s1.toString() auf

        s1.krieche();
        System.out.println("\nNach Runde 2:");
        System.out.println(s1);
    }
}
