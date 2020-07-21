public class forloops6 {
    public static void main(String[] args) {
         exrcise181(16);

         exercise183(35);

         exercise185(20);

         exercise188(8);

         exercise190(0.000001);

    }

    public static void exercise181(int N) {

        int m = (int) (Math.log(N) / Math.log(2));
        System.out.println(m);
    }

    public static void exercise183(int N) {
        double a;

        for (int i = 1; i <= N; i++) {
            a = Math.pow(3, i);
            if (a > N) {
                System.out.println("K = " + i);
                return;
            }
        }
    }

    public static void exercise185(int P) {
        int a = 30000;
        int k = 0;
        if (P > 0 && P < 25) {
            while (a < 100000) {
                a = a + a * P / 100;
                k = k + 1;
            }
        } else {
            System.out.print("Enter correct number, please");
        }
        System.out.println("month = " + k);
    }

    public static void exercise188(int N) {
        boolean y = false;
        int a = 0;
        int b = 0;
        int c = 1;
        for (int i = 1; i <= N; i++) {
            a = b;
            b = c;
            c = a + b;
            if (c == N) {
                y = true;
                break;
            }

        }
        System.out.println("y = " + y);

    }

    public static void exercise190(double eps) {
        double x1 = 1.0;
        double x2 = 2.0;
        double x3;
        double k = 3;
        
        while(Math.abs(x2 - x1) > eps) {
            x3 = (x1 + 2 * x2)/3; 
            x1 = x2;
            x2 = x3;
            k = k + 1;

        }
        System.out.println("k = " + k);
    }
}