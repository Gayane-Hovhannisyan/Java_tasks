public class coordinateXY {
    public static void main(String[] args) {

        double x = 2;
        double y = 1;

        double ex41 = exercise41(x, y);
        System.out.println("z =  " + ex41);

        double ex43 = exercise43(x, y);
        System.out.println("z =  " + ex43);

        double ex45 = exercise45(x, y);
        System.out.println("z =  " + ex45);

        double ex47 = exercise47(x, y);
        System.out.println("z =  " + ex47);

        double ex49 = exercise49(x, y);
        System.out.println("z = " + ex49);
    }

    public static double exercise41(double n1, double n2) {
        double z;
        if (Math.pow(n1, 2) + Math.pow(n2, 2) > 1 && Math.pow(n1, 2) + Math.pow(n2, 2) < 4) {
            z = 0;
        } else {
            z = n1 + n2;
        }
        return z;
    }

    public static double exercise43(double n1, double n2) {
        double z;
        if (n2 < 3 * n1 / 4 && Math.pow(n2, 2) + Math.pow(n1, 2) < 4) {
            z = Math.pow(n1, 2) + 4;
        } else {
            z = 5 * n1;
        }
        return z;
    }

    public static double exercise45(double n1, double n2) {
        double z;
        if (n2 > n1 && n2 > -n1 && Math.pow(n1, 2) + Math.pow(n2, 2) < 1) {
            z = 5 * Math.pow(n1, 2) + 2 * n2;
        } else {
            z = -7;
        }
        return z;
    }

    public static double exercise47(double n1, double n2) {
        double z;
        if (n2 > 0 && n2 < n1 + 1 && n2 < -n1 / 2 + 1) {
            z = Math.sin(n1);
        } else {
            z = 0;
        }
        return z;
    }

    public static double exercise49(double n1, double n2) {
        double z;
        if (n2 < Math.pow(n1, 2) && n2 < n1 / 2 + 1) {
            z = Math.log(Math.pow(n1, 2) + 1) / Math.log(5);
        } else {
            z = Math.pow(10, -7);
        }
        return z;
    }

}