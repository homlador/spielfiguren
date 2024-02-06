
/**
 * Wombats sind niedliche kleine Tiere aus Ozeanien.
 * 
 * @author (Peter Brichzin) 
 * @version (Version 1.1)
 */
public class Wombat extends Spielfigur
{
    private String fell;
    //fellSauberkeit geändert als String, damit diese Eigenschaft ausgegeben werden kann
    private String fellSauberkeit;

    /**
     * Konstruktor fuer Objekte der Klasse WOMBAT
     */
    public Wombat()
    {
        super(5, 10, 10); // Diese Zeile ist wichtig! Aufruf des Konstruktors der Oberklasse.
        // Damit werden die Werte der Attribute Stärke, Geschwindigkeit und Geschicklichkeit gesetzt.
        
        // Nun die Initalisierung der Attribute der Unterklasse
        fell = "kuschelig"; 
        fellSauberkeit = "sauber";
    }

    /**
    /**
     * Methode zur Rueckgabe einer Charakterbeschreibung
     * Implementierung der abstrakten Methode der Oberklasse
     * 
     * @return Charakterbeschreibung 
     */
    public String charakterbeschreibungAusgeben()
    {
        return "Wombats sind kleine Artgenossen mit kuscheligem Fell, die es aber auch in sich haben!";
    }
    
    /**
     * Gibt die Spielereigenschaften auf dem Ausgabefenster aus.
     * �berschreibt die Methode der Oberklasse
     */
    //mitverändert: Syso zu Fellsauberkeit
    public void SpielerEigenschaftenAusgeben()
    {
        System.out.println("Fell: "+ fell);
        System.out.println("Das Fell ist: "+fellSauberkeit);
        // Aufruf der gleichnamigen Methode der Oberklasse
        super.spielerEigenschaftenAusgeben();
    }
 
    /**
     * Gibt dem Wombat die Möglichkeit, sein Fell dreckig zu machen
     * (z.B. bei der Nahrungssuche)
     */
    //evtl umbenennen, obere Beschreibung ändern
    public void fellDreckigMachen(){
        fellSauberkeit = "dreckig";
    }
    
    /**
     * Gibt dem Wombat die Möglickeit, sein Fell zu säubern
     */
    public void fellSäubern(){
        fellSauberkeit = "sauber";
    }
    
}
