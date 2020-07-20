public class forloops6 {
    public static void main(String[] args) {
        xercise181(16);

        exercise183(35);
    }

    public static void exercise181(int N) {
     
        int m = (int)(Math.log(N) / Math.log(2));
        System.out.println(m);
    }

    public static void exercise183(int N) {
        double a;

        for(int i = 1; i <= N; i++) {
            a = Math.pow(3, i);
            if(a > N) {
                System.out.println("K = " + i); 
                return;
            }
        }
    }
}