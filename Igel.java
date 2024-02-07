
/**
 * TODO: Beschreiben Sie hier die Klasse Igel.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Igel extends Spielfigur
{
    // TODO: Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String fell;

    /**
     * Konstruktor für Objekte der Klasse Igel
     */
    public Igel()
    {    
        // TODO
        super(0, 0, 0, 1); // Diese Zeile ist wichtig! Aufruf des Konstruktors der Oberklasse.
        // Damit werden die Werte der Attribute Stärke, Geschwindigkeit und Geschicklichkeit gesetzt.
        
        
         fell = "grau / weiß";
    }

    /**
     * Methode zur Rueckgabe einer Charakterbeschreibung
     * Implementierung der abstrakten Methode der Oberklasse
     * 
     * @return Charakterbeschreibung 
     */
    public String charakterbeschreibungAusgeben()
    {
        // TODO
        return ""; 
    }
    
    /**
     * Gibt die Spielereigenschaften auf dem Ausgabefenster aus.
     * �berschreibt die Methode der Oberklasse
     */
    public void spielerEigenschaftenAusgeben()
    {
        System.out.println("Fell: " + fell);
        // Aufruf der gleichnamigen Methode der Oberklasse
        super.spielerEigenschaftenAusgeben();
    }
}
