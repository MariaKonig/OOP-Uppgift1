public class Palm extends Växt {

    public Palm(String namn, double höjd) {

        super(namn, höjd, TypAvVätska.KRANVATTEN);
    }

    public double mängdVätskaPerDag() {

        return getHöjd() * 0.5;
    }
}