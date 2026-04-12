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
     * <p>{@link ArrayList#remove(Object)} sucht selbstständig nach dem Element
     * und entfernt das <b>erste</b> Vorkommen. Dabei wird intern mit
     * {@code equals} verglichen – für {@link Rennschnecke}-Objekte bedeutet
     * das ohne eigene {@code equals}-Überschreibung einen Referenzvergleich,
     * d. h. nur das <i>exakt gleiche</i> Objekt wird gefunden.</p>
     *
     * <p><b>Didaktischer Hinweis zum „während-der-Iteration-modifizieren"-Problem:</b>
     * Man könnte versucht sein, die Liste mit einer {@code for-each}-Schleife zu
     * durchlaufen und beim Treffer {@code teilnehmer.remove(...)} aufzurufen.
     * Das führt zu einer {@link java.util.ConcurrentModificationException},
     * weil der for-each-Iterator bemerkt, dass sich die Liste unter ihm
     * verändert hat. Richtige Alternativen wären ein klassischer Index-Loop
     * mit Abbruch nach dem Entfernen oder ein {@link java.util.Iterator#remove()}.
     * Am einfachsten ist allerdings – wie hier gezeigt – der direkte
     * Aufruf ohne eigene Schleife.</p>
     *
     * @param schnecke die abzumeldende Schnecke
     * @return {@code true}, wenn eine Schnecke entfernt wurde, sonst {@code false}
     */
    boolean removeRennschnecke(Rennschnecke schnecke) {
        return teilnehmer.remove(schnecke);
    }
}
