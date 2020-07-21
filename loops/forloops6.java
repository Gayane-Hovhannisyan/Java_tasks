public class forloops6 {
    public static void main(String[] args) {
        exrcise181(16);

        exercise183(35);

        exercise185(20);

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

}