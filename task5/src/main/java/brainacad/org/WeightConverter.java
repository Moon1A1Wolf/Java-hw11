package brainacad.org;

public class WeightConverter {

    //milligrams
    public static double mgToG(double mg) {
        return mg / 1000.0;
    }

    public static double mgToKg(double mg) {
        return mg / 1_000_000.0;
    }

    public static double mgToCwt(double mg) {
        return mg / 100_000_000.0;
    }

    public static double mgToTon(double mg) {
        return mg / 1_000_000_000.0;
    }

    //grams
    public static double gToMg(double g) {
        return g * 1000.0;
    }

    public static double gToKg(double g) {
        return g / 1000.0;
    }

    public static double gToCwt(double g) {
        return g / 100_000.0;
    }

    public static double gToTon(double g) {
        return g / 1_000_000.0;
    }

    //kilograms
    public static double kgToMg(double kg) {
        return kg * 1_000_000.0;
    }

    public static double kgToG(double kg) {
        return kg * 1000.0;
    }

    public static double kgToCwt(double kg) {
        return kg / 100.0;
    }

    public static double kgToTon(double kg) {
        return kg / 1000.0;
    }

    //centners
    public static double cwtToMg(double cwt) {
        return cwt * 100_000_000.0;
    }

    public static double cwtToG(double cwt) {
        return cwt * 100_000.0;
    }

    public static double cwtToKg(double cwt) {
        return cwt * 100.0;
    }

    public static double cwtToTon(double cwt) {
        return cwt / 10.0;
    }

    //tons
    public static double tonToMg(double ton) {
        return ton * 1_000_000_000.0;
    }

    public static double tonToG(double ton) {
        return ton * 1_000_000.0;
    }

    public static double tonToKg(double ton) {
        return ton * 1000.0;
    }

    public static double tonToCwt(double ton) {
        return ton * 10.0;
    }
}
