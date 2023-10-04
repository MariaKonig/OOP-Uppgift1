/*  Klassen växt är en abstrakt klass, vilket betyder att den inte kan instansieras.
    Klassen implementerar ett interface men eftersom klassen är abstrakt behöver den inte
    skapa upp metoden från interfacet. Det kommer däremot alla subklasser till växt att behöva göra
    då de inte är abstrakta. */

public abstract class Växt implements IVattningsformel {

    public Växt(String namn, double höjd, TypAvVätska näringsvätska) {
        this.namn = namn;
        this.höjd = höjd;
        this.näringsvätska = näringsvätska;
    }

    //Inkapsling. Variabler har endast getters och är endast läsbara (read-only)
    private String namn;
    private double höjd;
    private TypAvVätska näringsvätska;


    public String getNamn() {
        return namn;
    }
    public double getHöjd() {
        return höjd;
    }
    public String getNäringsvätska() {
        return näringsvätska.text;
    }
}