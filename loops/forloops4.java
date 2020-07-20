public class forloops4 {
    public static void main(String[] args) {
        exercise151(6);

        exercise154(10);

        exercise156();

        exercise159();

        exercise162();

        exercise164(20);

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

    public static void exercise156() {
        long P = 1;
        for (int i = 10; i < 100; i++) {
            if (i % 3 == 0) {
                P = P * i;
            } else {
                if (i % 5 == 0) {
                    P = P * i;
                }
            }
        }
        System.out.println("P = " + P);
    }

    public static void exercise159() {
        long P = 1;
        for (int i = 100; i < 1000; i++) {
            if (i % 3 == 1 && i % 4 == 2) {
                P = P * i;
            }
        }
        System.out.println("P = " + P);
    }

    public static void exercise162() {

        double m, S;
        for (int i = 9999; i > 999; i--) {
            S = 14 * i;
            m = Math.sqrt(S);
            if (m / 1 == Math.floor(m)) {
                System.out.println("i = " + i);
                return;
            }

        }
    }

    public static void exercise164(int n) {
        for (int i = 10; i < 32; i++) {
            if (i > n) {
                System.out.println("value = " + i * i);
                return;
            }
        }
    }
}