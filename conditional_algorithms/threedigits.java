public class threedigits {
    public static void main(String[] args) {
        int n = 417;
        boolean ex51 = exercise51(n);
        System.out.println("d = " + ex51);

        int ex54 = exercise54(n);
        System.out.println("max = " + ex54);

        exercise56(n);

        exercise59(n);

    }

    public static boolean exercise51(int n1) {
        boolean d;
        int a = n1 % 10;
        int c = n1 / 100;
        int b = (n1 - 100 * c) / 10;
        if (a == b + c) {
            d = true;
        } else {
            d = false;
        }
        return d;
    }

    public static int exercise54(int n1) {
        int max;
        int a = n1 % 10;
        int c = n1 / 100;
        int b = (n1 - c * 100) / 10;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static void exercise56(int n1) {
        double k;
        int a = n1 % 10;
        int c = n1 / 100;
        int b = (n1 - c * 100) / 10;
        if (a > b) {
            k = (a + b + c) / n1;
            System.out.println(k);
        } else {

            System.out.println(n1);
        }
    }

    public static void exercise59(int n1) {
        int max, med, min;
        int a = n1 % 10;
        int c = n1 / 100;
        int b = (n1 - c * 100) / 10;
        if (a > b) {
            max  = a;
            min = b;
        } else {
            max = b;
            min = a;
        }
        if (c > max) {
            med = max;
            max = c;
        } else { if (min > c)
            {
                med = min;
                min = c;
            }
            else {
                med = c;
            }
        }
        System.out.println ("max = " + max + " med = " + med + " min = " + min);
    }
}