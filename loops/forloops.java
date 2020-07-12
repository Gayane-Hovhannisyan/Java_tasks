public class forloops {
    public static void main(String[] args) {
        exercise91(1);

        exercise94(1);

        exercise97(1);

        exercise99(1);

        exercise100(1);
    }

    public static void exercise91(double n) {
        double S = 0;
        double x = 1;
        for (double i = 1; i <= n; i++) {
            S = S + Math.pow(x, 2);
            x = 0.5 * Math.abs(x - 4);
        }
        System.out.println("S = " + S);
    }

    public static void exercise94(double n) {
        double S = 0;
        double x = -4.2;
        for (double i = 0; i <= n; i++) {
            S = S + x;
            x = 1 / Math.tan(x);
        }
        System.out.println("S = " + S);
    }

    public static void exercise97(double n) {
        double S = 1;
        double x = 1;
        for (double i = 0; i <= 3 * n; i++) {
            S = S * x;
            x = 0.5 * x + 7;
        }
        System.out.println("S = " + S);
    }

    public static void exercise99(double n) {
        double S = 0;
        double x = 5;
        for (double i = 1; i <= n; i++) {
            S = S + Math.pow(x, 2);
            x = Math.pow(x, 2) + 7;
        }
        System.out.println("S = " + S);
    }

    public static void exercise100(double n) {
        double S = 1;
        double x = 1;
        for (double i = 0; i <= n; i++) {
            S = S * x;
            x = (1 / Math.tan(x) + 1);
        }
        System.out.println("S = " + S);
    }
}