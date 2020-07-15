public class forloops3 {
    public static void main(String[] args) {
        exercise141(1);
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
}