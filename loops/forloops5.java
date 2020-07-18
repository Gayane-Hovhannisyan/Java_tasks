public class forloops5 {
  public static void main(String[] args) {

    exercise167(5);

    int z = exercise169(4, 4);
    System.out.println("z = " + z);

  }

  public static void exercise167(double x) {
    double a;
    boolean y;
    int k = 0;
    for (int n = 1; n < 31; n++) {
      a = Math.sin(Math.pow(x, n));
      if (a < 0) {
        k = k + 1;
      }
    }
    if (k > 0) {
      y = true;
    } else {
      y = false;
    }
    System.out.println("y = " + y);
  }

  public static int exercise169(int x, int y) {
    int z, a;
    int k = 0;
    a = x + y;
    for (int i = 2; i < a / 2; i++) {
      if (a % i == 0) {
        k = k + 1;
      }
    }
    if (k == 0) {
      z = 5;
    } else {
      z = 6;
    }

    return z;
  }

}