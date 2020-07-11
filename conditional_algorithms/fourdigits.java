import jdk.internal.platform.cgroupv1.SubSystem;

public class fourdigits {
    public static void main(String[] args) {
        int number = 6354;
        boolean ex61 = exercise61(number);
        System.out.println("k = " + ex61);

        double ex62 = exercise62(number);
        System.out.println("m = " + ex62);

        exercise66(number);

        double ex69 = exercise69(number);
        System.out.println("y = " + ex69);

        double ex70 = exercise70(number);
        System.out.println("y = " + ex70);
    }

    public static boolean exercise61(int n1) {
        boolean k;
        int d = n1 / 1000;
        int c = (n1 - d * 1000) / 100;
        int b = (n1 - 1000 * d - 100 * c) / 10;
        int a = n1 % 10;
        if (a + b == c + d) {
            k = true;
        } else {
            k = false;
        }
        return k;
    }

    public static double exercise62(int n1) {
        double m;
        int d = n1 / 1000;
        int c = (n1 - d * 1000) / 100;
        int b = (n1 - 1000 * d - 100 * c) / 10;
        int a = n1 % 10;
        if (n1 < 5000) {
            m = n1 / (a + c);
        } else {
            m = n1 / (b + d);
        }
        return m;
    }

    public static void exercise66(int n1) {
        int a = n1 / 1000;
        int b = n1 % 10;
        if (a == 4) {
            System.out.println("YES");
        } else {
            if (b == 4) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static int exercise69(int n1) {
        int y;
        int d = n1 / 1000;
        int c = (n1 - d * 1000) / 100;
        int b = (n1 - 1000 * d - 100 * c) / 10;
        int a = n1 % 10;
        int k = a + b + c + d;
        if (k > 20) {
            y = 1;
        } else {
            y = 0;
        }
        return y;
    }

    public static int exercise70(int n1) {
            int y;
            int d = n1 / 1000;
            int c = (n1 - d * 1000) / 100;
            int b = (n1 - 1000 * d - 100 * c) / 10;
            int a = n1 % 10;
            int k = a * b * c * d;
            if ( k > 200) {
                y = 0;
            } else {
                y = 1;
            }
            return y;
    }
}