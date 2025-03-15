

/*
 * Type promotional rules:
 * 1. All the byte,short,char values are promoted to int.
 * 2. If one them is float, long, double, all of the types will be promoted to double.
 * 3.
 * 
 * 
 * 
 * 
 */





public class Type_Casting {
    public static void main(String[] args) {
        byte b = 42;
        char c = 's';
        short s = 1024;
        int i = 500012;
        float f = 50.256f;
        double d = 0.2156;
        double result = (b*i) + (c*f) + (s * d);
        System.out.println((b*i) +" "+ (c*f) +" "+ (s * d));
        System.out.println(result);

    }
    
}
