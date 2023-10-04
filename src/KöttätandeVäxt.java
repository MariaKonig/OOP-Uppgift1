public class KöttätandeVäxt extends Växt {

    public KöttätandeVäxt(String namn, double höjd) {

        super(namn, höjd, TypAvVätska.PROTEINDRYCK);
    }

    public double mängdVätskaPerDag() {

        return  (getHöjd() * 0.2) + 0.1;

    }
}
