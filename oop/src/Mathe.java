public class Mathe {
    public static double rundenI(double value, int decimals) {
        return Math.round(value * Math.pow(10, decimals)) / Math.pow(10, decimals);
    }
    public static double rundenII(double value) {
        return Math.round(value * 100) / 100.;
    }
}
