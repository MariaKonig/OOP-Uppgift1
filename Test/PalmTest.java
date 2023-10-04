import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmTest implements ISubklassTest {

    Palm p = new Palm("pelle",3);


    @Test
    public void testMängdVätskaPerDag() {

        assertEquals(1.5 , p.mängdVätskaPerDag());
    }

    @Test
    public void testNäringsvärde() {
        assertEquals(TypAvVätska.KRANVATTEN.text, p.getNäringsvätska());
    }
}