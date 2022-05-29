public class decimalPlaces {
    public static void main (String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.1456,3.145));
    }

    public static boolean areEqualByThreeDecimalPlaces (double numberOne, double numberTwo) {
        double a = numberOne*1000; // először szorzom 1000-el, de marad double (kerekítés elkerülése miatt)
        int aa = (int) a; // majd eltűntetem a double-t, cast int
        double b = numberTwo*1000;
        int bb = (int) b;
        if (aa == bb) { // végül összehasonlítom
            return true;
        } else {
            return false;
        }
    }
}
