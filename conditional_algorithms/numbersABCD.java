public class numbersABCD {
    public static void main(String[] args) {
        int a = 9;
        int b = 8;
        int c = 7;
        int d = 8;

        int max = exercise31(a, b, c, d);
        System.out.println(" max = " + max);

        exercise34(a, b, c, d);

        exercise35(a, b, c, d);

        exercise37(a, b, c, d);

        exercise40(a, b, c, d);

    }

    public static int exercise31(int n1, int n2, int n3, int n4) {
        int max;
        if (n1 > n2) {
            max = n1;
        } else {
            max = n2;
        }
        if (n3 > max) {
            max = n3;
        }
        if (n4 > max) {
            max = n4;
        }
        return max;
    }

    public static void exercise34(int n1, int n2, int n3, int n4) {
        if (n1 + n2 == n3 + n4) {
            System.out.print("true");
        } else {
            if (n1 + n3 == n2 + n4) {
                System.out.println("true");
            } else {
                if (n1 + n4 == n2 + n3) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
            }

        }
    }

    public static void exercise35(int n1, int n2, int n3, int n4) {
        if (n1 == n2 + n3 + n4) {
            System.out.println("true");
        }
        if (n2 == n1 + n3 + n4) {
            System.out.println("ture");
        }
        if (n3 == n1 + n2 + n4) {
            System.out.println("true");
        } else {
            if (n4 == n1 + n2 + n3) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }

    public static void exercise37(int n1, int n2, int n3, int n4) {
        if (n1 + n2 == n3 + n4) {
            System.out.println("true");
        }
        if (n1 + n3 == n2 + n4) {
            System.out.println("true");
        }
        if (n1 + n4 == n2 + n3) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void exercise40(int n1, int n2, int n3, int n4) {
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

        if (n4 >= max) {
            System.out.println("  max = " + n4 + "  med = " + max + "  med = " + med + "  min = " + min);
        }
        if (max > n4 && med <= n4) {
            System.out.println("  max = " + max + "  med = " + n4 + "  med = " + med + "  min = " + min);
        }
        if (med > n4 && min >= n4) {
            System.out.println("  max = " + max + "  med = " + med + "  med = " + n4 + "  min = " + min);
        }
        if (n4 < min) {
            System.out.println("  max = " + max + "  med = " + med + "  med = " + min + "  min = " + n4);
        }

    }
}