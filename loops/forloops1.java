public class forloops1 {
    public static void main(String[] args) {
        exercise101(1);

        exercise104(1);

        exercise105(1);

        exercise107(1);

        exercise110(1);
    }

    public static void exercise101(int n) {
        double x = 1;
        double y = 1;
        double S = 0;
        for (int i = 1; i <= n; i++) {
            S = S + Math.pow((x + y), 2);
            x = 2 * Math.abs(x + 3);
            y = Math.pow(y, 2) - 4;
        }
        System.out.println("S = " + S);
    }

    public static void exercise104(int n) {
        double x = 7;
        double y = 8;
        double S = 0;
        for (int i = 0; i <= n; i++) {
            S = S + Math.pow(x, 2) - 2 * y;
            x = Math.pow(Math.sin(x), 2);
            y = y + 2;
        }
        System.out.println("S = " + S);
    }

    public static void exercise105(int n) {
        double x = 1;
        double y = 1;
        double S = 0;
        for (int i = 0; i <= n - 1; i++) {
            S = S + Math.pow(x, 2) + y;
            x = Math.sin(x) + 3;
            y = y + Math.cos(y);
        }
        System.out.println("S = " + S);
    }

    public static void exercise110(int n) {
        double a = 1;
        double b = 2;
        double S = 0;
        for (i = 1; i <= n; i++) {
            S = S + a + Math.pow(b, 2);
            a = 6 * a - 4;
            b = 5 * Math.tan(b) + 3;
        }
        System.out.println("S = " + S);
    }
}