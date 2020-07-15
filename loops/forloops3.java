public class forloops3 {
    public static void main(String[] args) {
        //exercise141(1);

        //exercise143(1);

        exercise145(0);
    }

    public static void exercise141(double a) {
        double S = 0;
        double P = 1;
        for (int m = 0; m <= 5; m++) {

            for (int n = 0; n <= 6; n++) {
                S = S + Math.pow(a, m + n);
            }
            P = P * S;
            S = 0;
        }
        System.out.println("P = " + P);
    }

    public static void exercise143(double n) {
        double S = 1;
        double P = 1;
        for (int i = 0; i <= 15; i++) {
            for (int m = 1; m <= 6; m++) {
                S = S * (i / (i + m * n));
            }
            P = P * S;
            S = 1;
        }
        System.out.println("P = " + P);
    }

    public static void exercise145( double c) {
        double S = 1;
        double P = 0;
        for (int i = 1; i <= 7; i++) {
            for (int k = 1; k <= 8; k++) {
                S = S * Math.pow(i,2) + c * k;
            }
            P = P + S;
            S = 1;
        }
        System.out.println("P = " + P);
    }
}