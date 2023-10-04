import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KaktusTest implements ISubklassTest{

    Kaktus k = new Kaktus("Björn");


    @Test
    public void testMängdVätskaPerDag() {

        assertEquals(0.02, k.mängdVätskaPerDag());
    }

    @Test
    public void testNäringsvärde() {

        assertEquals(TypAvVätska.MINERALVATTEN.text, k.getNäringsvätska());
    }
}