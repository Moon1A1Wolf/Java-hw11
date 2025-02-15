package brainacad.org;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WeightConverterTest {

    @Test
    public void testMilligramConversions() {
        assertEquals(0.001, WeightConverter.mgToG(1), 0.0001);
        assertEquals(0.000001, WeightConverter.mgToKg(1), 0.0000001);
        assertEquals(0.00000001, WeightConverter.mgToCwt(1), 0.00000001);
        assertEquals(0.000000001, WeightConverter.mgToTon(1), 0.0000000001);
    }

    @Test
    public void testGramConversions() {
        assertEquals(1000.0, WeightConverter.gToMg(1), 0.0001);
        assertEquals(0.001, WeightConverter.gToKg(1), 0.0001);
        assertEquals(0.00001, WeightConverter.gToCwt(1), 0.0001);
        assertEquals(0.000001, WeightConverter.gToTon(1), 0.0000001);
    }

    @Test
    public void testKilogramConversions() {
        assertEquals(1000000.0, WeightConverter.kgToMg(1), 0.0001);
        assertEquals(1000.0, WeightConverter.kgToG(1), 0.0001);
        assertEquals(0.01, WeightConverter.kgToCwt(1), 0.0001);
        assertEquals(0.001, WeightConverter.kgToTon(1), 0.0001);
    }
}
