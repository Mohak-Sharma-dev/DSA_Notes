

/*Type casting and conversion
 * When one type od data is assinged to another type of data, if these three conditions are met:
 * 1.Two types should be compatible,ie int to float, but int to string is not possible.
 * 2.Destination type should be greater than starting type.
 * 3.
 */

public class Casting_Conversion {
    public static void main(String[] args) {

        
        
        
        
        //Narrowing conversion, compressing bigger number into smaller
        int num = (int)(35.46);

        //Automatic type promoting in expression:
        int a = 257;
        byte b = (byte)(a);//Delievers remainder

        //If a and b were bytes, a*b/c , a*b is automatically converted to int then perforemed
        //\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\

        int number = '%';
        System.out.println(number);//Gives unicode values




    }
}
