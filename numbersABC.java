import java.util.Scanner;

public class numbersABC {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 4;

        int max = exercise21(a, b, c);
        System.out.println("max = " + max);

        exercise24(a, b, c);

        int m = exercise26(a, b, c);
        System.out.println("m = " + m);

        exercise29(a, b, c);

        exercise30(a, b, c);

    }

    public static int exercise21(int n1, int n2, int n3) {
        int max;
        if (n1 > n2) {
            max = n1;
        } else {
            max = n2;
        }
        if (max < n3) {
            max = n3;
        }
        return max;
    }

    public static void exercise24(int n1, int n2, int n3) {
        int k = 0;
        boolean n;
        if (n1 == 2) {
            k = k + 1;
        }
        if (n2 == 2) {
            k = k + 1;
        }
        if (n3 == 2) {
            k = k + 1;
        }
        if (k == 2) {
            System.out.print(" true ");
        } else {
            System.out.println(" false ");
        }

    }

    public static int exercise26(int n1, int n2, int n3) {
        int k = 0;
        int m;
        if (n1 % 2 == 0) {
            k = k + 1;
        }
        if (n2 % 2 == 0) {
            k = k + 1;
        }
        if (n3 % 2 == 0) {
            k = k + 1;
        }
        if (k >= 1) {
            m = 1;
        } else {
            m = 2;
        }
        return m;

    }

    public static void exercise29(int n1, int n2, int n3) {
        int min, med, max;
        if (n1 > n2) {
            if (n1 > n3) {
                max = n1;
                if (n2 > n3) {
                    med = n2;
                    min = n3;
                } else {
                    med = n3;
                    min = n2;
                }
            } else {
                med = n1;
                max = n3;
                min = n2;
            }
        } else {
            if (n2 > n3) {
                max = n2;
                if (n1 > n3) {
                    med = n1;
                    min = n3;
                } else {
                    med = n3;
                    min = n1;
                }
            } else {
                med = n2;
                max = n3;
                min = n1;
            }
        }
        System.out.println("min = " + min + "  med = " + med + "  max = " + max);

    }

    public static void exercise30(int n1, int n2, int n3) {
        int min, med, max;
        if (n1 > n2) {
            if (n1 > n3) {
                max = n1;
                if (n2 > n3) {
                    med = n2;
                    min = n3;
                } else {
                    med = n3;
                    min = n2;
                }
            } else {
                med = n1;
                max = n3;
                min = n2;
            }
        } else {
            if (n2 > n3) {
                max = n2;
                if (n1 > n3) {
                    med = n1;
                    min = n3;
                } else {
                    med = n3;
                    min = n1;
                }
            } else {
                med = n2;
                max = n3;
                min = n1;
            }
        }
        System.out.println("max = " + max + "  med = " + med + "  min = " + min);

    }
}
