public class exerciseA {
    public static void main(String[] args) {
        a();
        b();
        c();
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
             for(int j = 6-1-i; j < 6; j++) {
                 System.out.print(" * ");
             }
             System.out.print("\n");
         }

     }

     public static void c() {
        for (int i = 0; i<6; i++) {
            for(int j = 0; j <= 6-1-i; j++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
     }
}