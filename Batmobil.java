public class Batmobil extends Spielfigur{

    private String eigentuemer;
    private String model;
    private double beschleunigung;

    public Batmobil(int staerkeNeu, int geschicklichkeitNeu, int geschwindigkeitNeu, int groesseNeu) {
        super(15, 4, 257, 5);
        eigentuemer = "Batman";
        model = "The Black Tubler";
        beschleunigung = 5.6;
    }

    @Override
    public String charakterbeschreibungAusgeben() {
        return "Das beste Batmobil!";
    }

    @Override
    public void spielerEigenschaftenAusgeben() {
        System.out.println("Eigentümer: " + eigentuemer);
        System.out.println("Model: "+ model);
        System.out.println("Beschleunigung: " + beschleunigung);
        super.spielerEigenschaftenAusgeben();
    }
}
