import jdk.javadoc.internal.doclets.formats.html.resources.standard;

public class dowhile {
    public static void main(String[] args) {
        exercise81();

        exercise84();

        exercise86();

        exercise88();

        exercise89();
    }

    public static void exercise81() {
        double Y;
        double x = -7.5;
        do {
            Y = Math.log(Math.pow(x, 2) + 4) / Math.log(3);
            System.out.println("Y = " + Y);
            x = x + 0.3;
        } while (x <= 8.3);
    }

    public static void exercise84() {
        double Y;
        double x = -6.4;
        do {
            Y = Math.exp(1 / Math.tan(x));
            System.out.println("Y = " + Y);
            x = x + 0.2;
        } while (x <= 2.4);
    }

    public static void exercise86() {
        double Y;
        double x = -5;
        do {
            if (x > 2) {
                Y = Math.pow(3, x + 4);
            } else {
                Y = -8;
            }
            System.out.println("Y = " + Y);
            x = x + 2;
        } while (x <= 8);
    }

    public static void exercise88() {
        double Y;
        double x = -3;
        do {
            if (x > 1) {
                Y = 6 * Math.exp(8 + x);
            } else {
                Y = x + 4;
            }
            System.out.println("Y = " + Y);
            x = x + 0.8;
        } while (x < 3);
    }

    public static void exercise89() {
        double Y;
        double x = -5;
        do {
            if (x > 3) {
                Y = Math.log(x) / Math.log(4);
            } else {
                Y = -9;
            }
            System.out.println("Y = " + Y);
            x = x + 1.5;
        } while (x < 9);
    }
}