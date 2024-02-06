
/**
 * Beschreiben Sie hier die Klasse Stein.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Stein extends Spielfigur
{
    private String art;
    
    public Stein() {
        super(10, 0, 0, 1);  // Diese Zeile ist wichtig! Aufruf des Konstruktors der Oberklasse. 
        art = "Granit";
    }
    
    public String charakterbeschreibungAusgeben() {        
        return "Dies ist ein Stein";
    }
    
    /**
     * Gibt die Spielereigenschaften auf dem Ausgabefenster aus.
     * überschreibt die Methode der Oberklasse
     */
    public void spielerEigenschaftenAusgeben()
    {
        System.out.println("Art: " + art);
        // Aufruf der gleichnamigen Methode der Oberklasse
        super.spielerEigenschaftenAusgeben();
    }
}
