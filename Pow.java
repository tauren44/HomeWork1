package practice;

public class Pow {
    public static void main(String[] args) {
        System.out.println(pow(4, 2));
        System.out.println(pow(2, 3));
        System.out.println(pow(5, 4));
        System.out.println(pow(5, 0));
        System.out.println(pow(5, -1));

    }

    private static double pow(double base, double exponent) {
        if (exponent > 0) {
            double result = 1;
            for (int a = 0; a < exponent; a++) {
                result *= base;
            }
            return result;
        } else if (exponent < 0) {
            double result = 1;
            for (int a = 0; a > exponent; a--) {
                result /= base;
            }
            return result;
        }
        return 1;
    }
}
