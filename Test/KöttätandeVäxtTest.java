import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KöttätandeVäxtTest implements ISubklassTest{

    KöttätandeVäxt k = new KöttätandeVäxt("Lilo",0.7);


    @Test
    public void testMängdVätskaPerDag() {
        assertEquals(0.24,k.mängdVätskaPerDag());
    }

    @Test
    public void testNäringsvärde() {
        assertEquals(TypAvVätska.PROTEINDRYCK.text, k.getNäringsvätska());
    }
}