import java.util.Scanner;//Used to  get inputs, create an input object
import javax.swing.JOptionPane;//Used for a GUI/Dialoge box.

public class Hello {
/* public: Access modifier, allows contents of the class "Hello" to be accesed outside of the class.
 * class: keyword assigned to define a class
 * Hello: Class name, usually starts with capital letters
 */
    public static void main(String[] args){
        /* public: Access modifier, must be Public, as progra starts execution from main.
         * static: keyword assigned to allow main to be called without needing to be declaring an object.
         * void: keyword assigned to main to not return any value.
         * main: main function, programs starts execution here.
         * String[] args:
         * Shortcut: psvm + enter.
         */
        System.out.println("Hello, World!");
        /* System: Class that provides useful methods and properties.
         * PrintStream: Class that provides methods to print data.
         * out: Object fo System class, outputs data to the console.
         * println: object of out class, prints data then newline to the console.
         * "Hello, World!":
         * Shortcut: sout + enter.
         */
    }
}
/* Additional Notes:
 * Package is just a folder, it is used to organize classes.
 * Primitives are datatypes which cannot be broken into further data types.
 * Floating points are not accurate.
 * Ints can be converted into floats, but not vice versa.
 * 67 => 67.0, but 67.0 => 67 is not possible.
 * Left ahnd side should be grater than right hand side.
 * int VS Integer: int is a primitive datatype, Integer is a class.
 * int a = 10; Integer b = 10; a == b; is not possible.
 */
