import org.graalvm.compiler.hotspot.stubs.OutOfBoundsExceptionStub;

public class Arrays2 {
    public static void main(String[] args) {
        exercise223(0, 100);

        exercise225(100);

        exercise226(50);

        exercise227(6);

        exercise229();

        exercise230(4);

    }

    public static void exercise223(int a, int b) {
        int numbers[] = { 2, 17, -5, -52, 15, 26, -6, 12, -6 };
        int k = 0;
        for (int i = 0; i < 9; i++) {
            if (numbers[i] > a && numbers[i] < b) {
                k = k + 1;
            }
        }
        System.out.println("k = " + k);
    }

    public static void exercise225(int t) {
        int numbers[] = { 5, 25, -125, -7, -36, 47, 36, 9, 71, -8, -37, -19 };
        int k = 1;
        for (int i = 0; i < 12; i++) {
            if (Math.abs(numbers[i]) < t) {
                k = k * numbers[i];
            }
        }
        System.out.println("P = " + k);
    }

    public static void exercise226(int k) {
        int numbers[] = { 5, 25, -125, -7, -36, 47, 36, 9, 71, -8, -37, -19 };
        int m = 1;
        for (int i = 0; i < 12; i++) {
            if (Math.abs(numbers[i]) < k) {
                m = m + 1;
            }
        }
        System.out.println("m = " + m);
    }

    public static void exercise227(int k) {
        int numbers[] = { 5, 47, -9, -3, 7, 63, 12, 18, -25, -1, -3, -2, 32, 4 };
        double S = 0;
        int m = 0;
        for (int i = 0; i < 14; i++) {
            if (i % k == 0) {
                S = S + numbers[i];
                m = m + 1;
            }
        }
        S = S / m;
        System.out.println("S = " + S);
    }

    public static void exercise229() {
        int numbers[] = { 5, 47, -9, -3, 7, 63, 12, 18, -25, -1, -3, -2, 32, 4 };
        int P = 1;
        for (int i = 0; i < 14; i++) {
            if (numbers[i] - i > 0) {
                P = P * numbers[i];
            }
        }
        System.out.println("P = " + P);

    }

    public static void exercise230(int k) {
        double numbers[] = { 5, 4.7, -9.5, -50.3, 1.7, 63.7, 12.3, 18.2, -25.4, -12.9, -24.33, -2.2, 3.2, 4 };
        double S = 0;
        int m = 0; 
        for (int i = 0; i < 14; i++) {
            if ((int)numbers[i] % k == 0) {
                S = S + Math.pow(numbers[i], 2);
                m = m + 1;
            }
        }
        S = Math.sqrt(S) / m;
        System.out.println("S230 = " + S);
    }
}
