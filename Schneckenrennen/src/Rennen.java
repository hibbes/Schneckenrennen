import java.util.ArrayList;

/**
 * Verwaltet ein Schneckenrennen: Strecke, Teilnehmerliste und An-/Abmeldung.
 *
 * <p><b>OOP-Konzepte:</b>
 * <ul>
 *   <li>{@link ArrayList}: dynamische Liste – wächst und schrumpft zur Laufzeit</li>
 *   <li>Generics ({@code ArrayList<Rennschnecke>}): Typsicherheit bei Sammlungen</li>
 *   <li>for-each-Schleife: elegantes Iterieren über Listen</li>
 * </ul>
 * </p>
 *
 * <p><b>Bekannte Einschränkung:</b> {@link #removeRennschnecke(Rennschnecke)} ist
 * noch nicht vollständig implementiert (leere Schleife). Eine korrekte Variante
 * findet sich in {@code Schneckenrennen_2021}.</p>
 *
 * @author hibbes
 * @see Rennschnecke
 */
public class Rennen {

    /** Bezeichnung des Rennens (z. B. "Bilster Berg"). */
    String name;

    /** Geplante Anzahl an Teilnehmern (bisher nicht aktiv genutzt). */
    int teilnehmerzahl;

    /** Länge der Rennstrecke in beliebigen Einheiten. */
    float laenge;

    /**
     * Liste der angemeldeten Rennschnecken.
     * ArrayList erlaubt dynamisches Hinzufügen und Entfernen,
     * ohne dass eine feste Größe angegeben werden muss.
     */
    ArrayList<Rennschnecke> teilnehmer = new ArrayList<Rennschnecke>();

    /**
     * Erstellt ein neues Rennen.
     *
     * @param name   Name des Rennens
     * @param laenge Streckenlänge
     */
    public Rennen(String name, float laenge) {
        this.name   = name;
        this.laenge = laenge;
    }

    /**
     * Meldet eine Rennschnecke für dieses Rennen an.
     *
     * @param neueSchnecke die anzumeldende Schnecke
     */
    void addRennschnecke(Rennschnecke neueSchnecke) {
        teilnehmer.add(neueSchnecke);
    }

    /**
     * Entfernt eine Rennschnecke aus der Teilnehmerliste.
     *
     * <p><b>TODO:</b> Diese Methode ist noch nicht vollständig implementiert –
     * die Schleife enthält keine Entfernen-Logik. Korrekte Implementierung:
     * {@code teilnehmer.remove(schnecke)} oder Iterator-basiertes Entfernen
     * (da während der Iteration modifiziert wird).</p>
     *
     * @param schnecke die abzumeldende Schnecke
     */
    void removeRennschnecke(Rennschnecke schnecke) {
        for (Rennschnecke schnegge : teilnehmer) {
            // TODO: Entfernen-Logik implementieren, z. B.:
            // if (schnegge == schnecke) { teilnehmer.remove(schnecke); break; }
        }
    }
}
