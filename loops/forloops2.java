public class forloops2 {
    public static void main(String[] args) {
        exercise121(1);

        exercise123(1);
    }

    public static void exercise121(int n) {
        double x, y, S;
        S = 0;
        for (int i = 1; i <= 16; i++) {
            if (i % 2 == 1) {
                x = i;
            } else {
                x = Math.pow(i, 3);
            }
            if (Math.pow(i, 2) % 2 == 1) {
                y = Math.pow(i, 2);
            } else {
                y = i;
            }
            S = S + Math.pow(x - y, 2);
        }
        System.out.println("S = " + S);
    }

    public static void exercise123(int n) {
        double x, y;
        double S = 1;
        for (i = 1; i <= 14; i++) {
            if (i % 2 == 1) {
                x = Math.exp(i - 4);
            } else {
                x = Math.pow(i, 2) - i;
            }
            y = Mah.pow(i, 4);
            S = S * Math.pow(x, 2) * Math.pow(y, 2);
        }
        System.out.println("S = " + S);
    }
}