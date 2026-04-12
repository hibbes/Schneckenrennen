# Schneckenrennen

Einfache OOP-Simulation eines Schneckenrennens – Einstiegsprojekt für **objektorientiertes Denken** im Informatikunterricht.

## Klassen

| Klasse | Beschreibung |
|--------|--------------|
| `Rennschnecke` | Objekt mit Name, Rasse, Höchstgeschwindigkeit; Methode `kriechen()` bewegt die Schnecke um einen zufälligen Betrag |
| `Rennen` | Verwaltet die Teilnehmerliste (`ArrayList<Rennschnecke>`) und die Streckenlänge |
| `Main` | Testklasse: erzeugt Schnecken, meldet sie beim Rennen an und lässt sie kriechen |

## Lernziele

- Objekte modellieren: Attribute (Zustand) und Methoden (Verhalten) unterscheiden
- Konstruktoren schreiben und `toString()` überschreiben
- Dynamische Sammlungen mit `ArrayList<T>`
- Zufallszahlen mit `java.util.Random`
- `for-each`-Schleife über eine Collection

## Beispiel

```java
Rennschnecke turbo = new Rennschnecke("Turbo", "Weinbergschnecke", 3);
Rennschnecke flitzi = new Rennschnecke("Flitzi", "Tigerschnecke", 5);

Rennen r = new Rennen(100);
r.anmelden(turbo);
r.anmelden(flitzi);
r.kriechenLassen();
```

## Projektstruktur

```
Schneckenrennen/
└── Schneckenrennen/          ← Eclipse-Projekt
    ├── README.md
    └── src/
        ├── Main.java
        ├── Rennen.java
        └── Rennschnecke.java
```

## Weiterentwicklung

Für eine vollständige Rennsimulation (mit Gewinner­ermittlung, Wettbüro und Schleife bis zur Ziellinie) siehe das Nachfolgeprojekt **[Schneckenrennen_2021](https://github.com/hibbes/Schneckenrennen_2021)**.

## Kontext

Unterrichtsmaterial Informatik (Schiller-Gymnasium Offenburg) – typischerweise als erstes OOP-Projekt nach der prozeduralen Einführung eingesetzt.
