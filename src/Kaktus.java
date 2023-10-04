public class Kaktus extends Växt {

    /*  Konstruktorn tar inte in höjd då det är irrelevant för omhändertagandet av växten.
        Sätter värde 0 istället för att skapa upp en ny konstruktor i superklassen utan höjd,
        då det lämnar utrymme för misstag när den ska anropas av andra klasser.   */
    public Kaktus(String namn) {

        super(namn, 0, TypAvVätska.MINERALVATTEN);
    }

    public double mängdVätskaPerDag() {

        return 0.02;
    }
}
