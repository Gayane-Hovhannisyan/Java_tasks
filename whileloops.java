public class whileloops {
    public static void main(String[] args) {

        double x = 2.4;
        exercise71(x);

        x = -3.8;
        exercise74(x);

        x = 10;
        exercise78(x);

        exercise79(-4);

    }

    public static void exercise71(double x) {
        double Y;
        while (x <= 7.6) {
            Y = Math.tan(2 * x + Math.pow(x, 2));
            System.out.println("Y = " + Y);
            x = x + 0.2;
        }

    }

    public static void exercise74(double x) {
        double Y;
        while (x <= 12.5) {
            Y = Math.pow(2, x + 4);
            System.out.println("Y = " + Y);
            x = x + 0.5;
        }

    }

    public static void exercise78(double x) {
        double Y;
        while (x <= 20) {
            if (x > 12) {
                Y = 3 * (Math.log(x) / Math.log(3));
            } else {
                Y = Math.pow(x, 3);
            }
            System.out.println(Y);
            x = x + 2;
        }
    }

    public static void exercise79(double x) {
        double Y;
        while (x <= 5) {
            if (x > 1) {
                Y = Math.log(x) / Math.log(4);
            } else {
                Y = -9;
            }
            System.out.println(Y);
            x = x + 1;
        }
    }

}