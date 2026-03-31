import java.util.Random;

/**
 * Modelliert eine Rennschnecke als Objekt.
 *
 * <p>Eine Rennschnecke hat einen Namen, eine Rasse und eine Höchstgeschwindigkeit.
 * Mit der Methode {@link #krieche()} bewegt sie sich zufällig um 0 bis {@code vmax}
 * Einheiten vorwärts.</p>
 *
 * <p><b>OOP-Konzepte:</b>
 * <ul>
 *   <li>Attribute: Zustand eines Objekts (name, rasse, vmax, strecke)</li>
 *   <li>Konstruktor: initialisiert das Objekt bei der Erstellung</li>
 *   <li>{@link #toString()}: Standardmethode zur Textdarstellung eines Objekts</li>
 *   <li>Zufallszahlen mit {@link Random#nextInt(int)}</li>
 * </ul>
 * </p>
 *
 * @author hibbes
 * @see Rennen
 */
public class Rennschnecke {

    /** Rufname der Schnecke. */
    String name;

    /** Rassenbezeichnung (z. B. "Glitscho", "Rasanto"). */
    String rasse;

    /**
     * Maximale Geschwindigkeit: Pro Runde kann die Schnecke 0 bis {@code vmax}
     * Einheiten vorwärtsriechen.
     */
    int vmax;

    /** Bisher zurückgelegte Gesamtstrecke (startet bei 0). */
    int strecke;

    /**
     * Erstellt eine neue Rennschnecke.
     *
     * <p>Die Strecke startet immer bei 0 – die Schnecke steht am Anfang
     * auf der Startlinie.</p>
     *
     * @param name  Rufname
     * @param rasse Rassenbezeichnung
     * @param vmax  Maximale Schrittweite pro Runde (> 0)
     */
    public Rennschnecke(String name, String rasse, int vmax) {
        this.name   = name;
        this.rasse  = rasse;
        this.vmax   = vmax;
        strecke     = 0;        // explizit auf 0 setzen (Startposition)
    }

    /**
     * Bewegt die Schnecke um eine zufällige Strecke vorwärts.
     *
     * <p>{@code Random.nextInt(n)} liefert eine Zufallszahl im Bereich [0, n).
     * Mit {@code nextInt(vmax + 1)} wird der Bereich auf [0, vmax] ausgedehnt,
     * sodass auch {@code vmax} selbst möglich ist.</p>
     */
    public void krieche() {
        Random ran = new Random();
        strecke = strecke + ran.nextInt(vmax + 1);   // 0 bis vmax Einheiten vorwärts
    }

    /**
     * Gibt den Zustand der Schnecke als lesbare Zeichenkette zurück.
     *
     * <p>Diese Methode überschreibt {@code Object.toString()}, das Java für
     * jedes Objekt aufruft, wenn es in einen String umgewandelt wird –
     * etwa bei {@code System.out.println(schnecke)}.</p>
     *
     * @return mehrzeilige Zustandsbeschreibung
     */
    @Override
    public String toString() {
        return "Name: " + name + "\n"
             + "Rasse: " + rasse + "\n"
             + "Höchstgeschwindigkeit: " + vmax + "\n"
             + "Geschleimte Strecke: " + strecke;
    }
}
