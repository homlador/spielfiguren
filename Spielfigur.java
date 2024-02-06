/**
 * Die Klasse Spielfigur ist eine Oberklasse für die Akteure 
 * in einem Videospiel.
 * 
 * @author (Peter Brichzin) 
 * @version (Version 2)
 * 
 * Notizen:
 *      abstrakte Klassen 
 *          - machen nur Sinn als Oberklasse
 *          - es kann kein Objekt dovon erzeugt werden
 *          - es können abstrakte Methoden vereinbart werden
 *      abstrakte Methoden 
 *          - legen nur den Methodenkopf fest
 *          -> Rumpf muss in der Unterklasse (in der Schnittstellenimplemtierung) ausgef�hrt werden
 *          
 */
public abstract class Spielfigur                //abstrakt == es kann keine Spielfigur als Objekt gegeben werden. 
{
    private int staerke;
    private int geschicklichkeit;
    private int geschwindigkeit;
    private int groesse;

    /**
     * Konstruktor f�r Objekte der Klasse SPIELFIGUR
     * @param staerkeNeu
     * @param geschicklichkeitNeu
     * @param geschwindigkeitNeu
     * @param groesseNeu
     */
    public Spielfigur(int staerkeNeu, int geschicklichkeitNeu, int geschwindigkeitNeu, int groesseNeu)
    {
        if (staerkeNeu<=20)
        {
            staerke = staerkeNeu;
        }
        else
        {
            staerke=0;
        }
        if (geschicklichkeitNeu<=20)
        {
            geschicklichkeit = geschicklichkeitNeu;
        }
        else
        {
            geschicklichkeit=0;
        }
        if (geschwindigkeitNeu<=20)
        {
            geschwindigkeit = geschwindigkeitNeu;
        }
        else
        {
            geschwindigkeit=0;
        }

        if (groesseNeu<=20)
        {
            groesse = groesseNeu;
        }
        else
        {
            groesse=0;
        }
        
        if(staerke + geschicklichkeit + geschwindigkeit >40)
        {
            staerke=0;
            geschicklichkeit=0;
            geschwindigkeit=0;
        }

    }

    /**
     * Methode zur Rueckgabe einer Charakterbeschreibung
     * 
     * @return Charakterbeschreibung 
     */
    public abstract String charakterbeschreibungAusgeben();
  
    /**
     * Gibt die Spielereigenschaften auf dem Ausgabefenster aus.
     * 
     */
    public void spielerEigenschaftenAusgeben()
    {
        System.out.println("Geschwindigkeit: " + GeschwindigkeitGeben());
        System.out.println("Geschicklichkeit: " + GeschicklichkeitGeben());
        System.out.println("Staerke         : " + StaerkeGeben());
        System.out.println("Groesse         : " + GroesseGeben());
    }

    /**
     * Gibt die Geschicklichkeit zur�ck.
     * 
     * @return        staerke
     */
    public int GeschicklichkeitGeben()
    {
        return geschicklichkeit;
    }

    /**
     * Gibt die Geschwindigkeit zur�ck.
     * 
     * @return        staerke
     */
    public int GeschwindigkeitGeben()
    {
        return geschwindigkeit;
    }

    /**
     * Gibt die Staerke zur�ck.
     * 
     * @return        staerke
     */
    public int StaerkeGeben()
    {
        return staerke;
    }
    
    /**
     * Gibt die Groesse zur�ck.
     * 
     * @return        groesse
     */
    public int GroesseGeben()
    {
        return groesse;
    }
}
