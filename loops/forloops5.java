public class forloops5 {
  public static void main(String[] args) {

    exercise167(5);

    int z = exercise169(4, 4);
    System.out.println("z = " + z);

    exercise170(5);

    exercise174(12);

    exercise179(27 , 5);
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

  public static void exercise170(int n) {
    int m = 1;
    while (m <= 2 * n) {
      if (m > n) {
        System.out.println("m = " + m);
        break;
      } else {
        m = m * 2;
      }
    }

  }

  public static void exercise174(int N) {
    double x;
    int x0 = 2;
    System.out.println("x0 = " + x0);
    for (int k = 1; k <= N; k++) {
      double m = (double) 1 / k;
      System.out.println(m);
      x = 2 + m;
      System.out.println("x" + k + " = " + x);

    }
  }

  public static void exercise179(int N, int K) {
    int m = N;
    int h = 0;
    while (m >= K) {
      m = m - K;
      h = h + 1;
      if (m < K ) {
        System.out.println(m);
        System.out.println(h);

      }
    }
  }
}