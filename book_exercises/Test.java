public class Test {
    public static void main(String[] args) {
        // check point 4.2.1
        double  a;
        a = (int) Math.sin(2 * Math.PI);
        System.out.println("a1 = " + a);

        a = (int) Math.cos(2*Math.PI);
        System.out.println("a2 = " + a);

        double b = Math.exp(1);
        System.out.println("b = " + b);

        a = Math.max(2, Math.min(3, 4));
        System.out.println("a3 = " + a);

        a = Math.rint(-2.5);
        System.out.println("a4 = " + a);

        a = Math.ceil(-2.5);
        System.out.println("a5 = " + a);

        a = Math.floor(-2.5);
        System.out.println("a6 = " + a);

        a = Math.round(-2.5f);
        System.out.println("a7 = " + a);
        
        a = Math.round(-2.5);
        System.out.println("a8 = " + a);
        
        a = Math.rint(2.5);
        System.out.println("a9 = " + a);
        
        a =  Math.ceil(2.5);
        System.out.println("a10 = " + a);
        
        a =  Math.floor(2.5);
        System.out.println("a11 = " + a);
        
        a = Math.round(2.5f);
        System.out.println("a12 = " + a);
        
        a =  Math.round(2.5);
        System.out.println("a13 = " + a);
        
        a =  Math.round(Math.abs(-2.5));
        System.out.println("a14 = " + a);
    }
}