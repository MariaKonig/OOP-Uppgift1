public class Kaktus extends Växt {

    /*  Konstruktorn tar inte in höjd då det är irrelevant för omhändertagandet av växten.
        Sätter värde 0 istället för att skapa en ny konstruktor i klassen växter,
        då det lämnar utrymme för misstag i andra klasser.   */
    public Kaktus(String namn) {

        super(namn, 0, TypAvVätska.MINERALVATTEN);
    }

    public double mängdVätskaPerDag() {

        return 0.02;
    }
}
