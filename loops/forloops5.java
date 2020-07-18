public class forloops5 {
  public static void main(String[] args) {
    exercise167(5);
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

}