import jdk.javadoc.internal.doclets.formats.html.resources.standard;

public class arrays4 {
    public static void main(String[] args) {

        exercise242(2);

        exercise244();

        exercise245();

        exercise246();

        exercise248(2);

        exercise250();

    }

    public static void exercise242(int m) {
        int numbers[] = { 0, 5, 18, 6, 35, 9, -1, 27, 15, 115, 0, 0, 4 };
        int P = 1;
        for (int i = 0; i < 13; i++) {
            if (numbers[i] % m == 0 && numbers[i] > 0) {
                P = P * numbers[i];
            }
        }
        System.out.println("P = " + P);
    }

    public static void exercise244() {
        int numbers[] = { 0, 5, 18, 6, 35, 9, -1, 27, 15, 115, 0, 0, 4 };
        int P = 1;
        for (int i = 0; i < 13; i++) {
            if (numbers[i] % 5 == 2) {
                P = P * numbers[i];
            }
        }
        System.out.println("P = " + P);
    }

    public static void exercise245() {
        int numbers[] = { 3, 5, 16, 6, 35, 9, -1, 27, 15, 115, 0, 0, 4 };
        int S = 0;
        int m;
        for (int i = 0; i < 13; i++) {
            m = i + numbers[i];
            if (m % 3 == 0) {
                S = S + numbers[i];
            }
        }
        System.out.println("S = " + S);

    }

    public static void exercise246() {
        int numbers[] = { 3, 1, 16, 6, 1, 9, -1, 27, 15, 1, 7, 5, 4 };
        int m = 0;
        double S = 0;
        for (int i = 1; i < 13; i++) {
            double k = Math.sqrt(i);
            double l = k - (int) k;
            if (l == 0) {
                System.out.println("numbers[" + i + "] = " + numbers[i]);
                S = S + numbers[i];
                m = m + 1;
            }
        }
        S = S / m;
        System.out.println("S = " + S);
    }

    public static void exercise248(int k) {
        int numbers[] = { 3, 1, 16, 6, 1, 9, -1, 27, 15, 1, 7, 5, 4 };
        int S = 0;
        for (int i = 0; i < 13; i++) {
            int l = i + numbers[i];
            if (Math.pow(l, 2) % k == 0) {
                S = S + numbers[i];
            }
        }
        System.out.println("S = " + S);
    }

    public static void exercise250() {
        int numbers[] = { 3, 1, 16, 6, 1, 9, -1, 27, 15, 1, 7, 5, 4 };
        int P = 1;
        for (int i = 0; i < 13; i++) {
            int m = i * numbers[i];
            if (m % 3 == 2) {
                P = P * numbers[i];
            }
        }
        System.out.println("P = " + P);
    }

}