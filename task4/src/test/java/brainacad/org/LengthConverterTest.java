package brainacad.org;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class LengthConverterTest {

    @Test
    public void testMillimeterConversions() {
        assertEquals(0.1, LengthConverter.mmToCm(1), 0.0001);
        assertEquals(0.01, LengthConverter.mmToDm(1), 0.0001);
        assertEquals(0.001, LengthConverter.mmToM(1), 0.0001);
        assertEquals(0.000001, LengthConverter.mmToKm(1), 0.0000001);
    }

    @Test
    public void testCentimeterConversions() {
        assertEquals(10.0, LengthConverter.cmToMm(1), 0.0001);
        assertEquals(0.1, LengthConverter.cmToDm(1), 0.0001);
        assertEquals(0.01, LengthConverter.cmToM(1), 0.0001);
        assertEquals(0.00001, LengthConverter.cmToKm(1), 0.0000001);
    }

    @Test
    public void testMeterConversions() {
        assertEquals(1000.0, LengthConverter.mToMm(1), 0.0001);
        assertEquals(100.0, LengthConverter.mToCm(1), 0.0001);
        assertEquals(10.0, LengthConverter.mToDm(1), 0.0001);
        assertEquals(0.001, LengthConverter.mToKm(1), 0.0001);
    }
}