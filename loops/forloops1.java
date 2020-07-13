public class forloops1 {
    public static void main(String[] args) {
        exercise101(1);
    }

    public static void exercise101(int  n) {
        double x = 1;
        double y = 1;
        double S = 0;
        for (int i = 1; i <= n; i++) {
            S = S + Math.pow((x + y), 2);
            x = 2 * Math.abs(x + 3);
            y = Math.pow(y,2) - 4;
        }
        System.out.println("S = " + S);
    }
}