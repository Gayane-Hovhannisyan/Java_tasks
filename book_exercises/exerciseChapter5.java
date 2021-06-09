public class exerciseChapter5 {
    public static void main(String[] args) {
        /*a();
        b();
        c();*/
        chap57();
    }
    public static void a () {
        for(int i = 0; i<6; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.print("\n");

        }
    }
     public static void b() {
         for (int i = 0; i<6; i++) {
             for(int j = 0; j < 6-i-1; j++) {
                 System.out.print(" * ");
             }
             System.out.print("\n");
         }

     }

     public static void c() {
        for (int i = 0; i<6; i++) {
            for(int j = 6-1-i; j <= 6; j++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
     }

     public static void chap57() {
         int a = 0;
         double S = 10000;
        for(int i = 0; i < 10; i++) {
             S = S + S * 0.06;
             System.out.println(i+1 + "year:    S = " + S);
         }
     }
}