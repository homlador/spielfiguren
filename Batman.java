
/**
 * Batman ist ein Superheld. 
 */
public class Batman extends Spielfigur
{
    private String gegner;
    
    public Batman() {
        super(11, 11, 11);  // Diese Zeile ist wichtig! Aufruf des Konstruktors der Oberklasse. 
        gegner = "Joker";
    }
    
    public String charakterbeschreibungAusgeben() {        
        return "Ich bin Batman. Es ist nicht, wer ich darunter bin, sondern was ich tue, das mich ausmacht";
    }
    
    /**
     * Gibt die Spielereigenschaften auf dem Ausgabefenster aus.
     * überschreibt die Methode der Oberklasse
     */
    public void spielerEigenschaftenAusgeben()
    {
        System.out.println("Gegner: " + gegner);
        // Aufruf der gleichnamigen Methode der Oberklasse
        super.spielerEigenschaftenAusgeben();
    }
}
