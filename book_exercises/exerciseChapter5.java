import java.util.Scanner;
public class exerciseChapter5 {
    public static void main(String[] args) {
        /*a();
        b();
        c();
        chap57(); 
        chap58() */

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
             System.out.println(i+1 + "year:    S = " + S);}
         }

    public static void chap58() {
        Scanner input = new Scanner(System.in);
    System.out.println("Enter number of students: ");
    int studentNumber = input.nextInt();

    System.out.println("****" + studentNumber);
    System.out.println("Enter name and score: ");

    // String input
    for(int i = 0; i < studentNumber; i++) {
    String name = input.nextLine();
    System.out.println("****" + name);


    // Numerical input
    int score = input.nextInt(); 
    System.out.println("****" + score);}
  }

  
    }