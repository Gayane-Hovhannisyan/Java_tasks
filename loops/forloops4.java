public class forloops4 {
    public static void main(String[] args) {
        exercise151(6);

        exercise154(10);

    }

    public static void exercise151(int n) {
        int S = 0;
        for (int i = 1; i < n / 2; i++) {
            if (n % i == 0) {
                S = S + i + n / i;
            }
        }

        System.out.println("S = " + S);
    }


    public static void exercise154(int n) {
        int P = 1;
        for (int i = 1; i < n / 2 + 3; i++) {
            if (n % i == 3) {
                P = P * i;
            }
        }
        System.out.println("P = " + P);
    }
}