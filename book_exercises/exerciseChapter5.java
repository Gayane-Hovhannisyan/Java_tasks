import java.util.Scanner;
public class exerciseChapter5 {
    public static void main(String[] args) {
        //a();
        //b();
        //c();
        //d();
        //chap57(); 
        //chap58() 
        //chap517();
        chap550();

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
            for(int j = i; j < 6; j++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
     }

     public static void d() {
         for(int i = 0; i<6; i++) {
             for(int j = 6-i-1; j < 6; j++) {
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

  public static void chap517() {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter number ");
    int number = input.nextInt();
    int m = number;
    for(int i = 0; i< 2*number-1; i++) {
        if(m == 0) {continue;}
        System.out.print(Math.abs(m) + " ");
        m = m-1;
        
    }
  }

  public static void chap550() {
      for(int i = 1; i < 10; i++){
          for(int j = 1; j<10; j++) {
              System.out.println(i +" * " + j + " = " + i*j);
          }
          System.out.print("\n");
      }
  }
    }