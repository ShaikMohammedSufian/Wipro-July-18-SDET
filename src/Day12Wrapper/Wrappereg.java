package Day12Wrapper;

public class Wrappereg {
    public static void main(String[] args) {
        // Wrapping is the process of converting primitive datatype to object
        // There are 8 wrapper classes - Byte, Boolean, Character, Double, Float, Integer, Long, Short
        // Autoboxing converts data type to object

        // Autoboxing: primitive -> object
        int a = 20;
        Integer i = a; // autoboxing (compiler does Integer.valueOf(a) internally)

        System.out.println(i); // prints 20

        // Unboxing: object -> primitive
        Integer s = new Integer(6); // creating an Integer object
        int x = s.intValue();       // manually unboxing (older way)
        int y = s;                  // unboxing (compiler automatically converts to int)

        System.out.println(x); // prints 6
        System.out.println(y); // prints 6
    
		
/*Eight Wrapper Classes:
Java provides a wrapper class for each of its eight primitive data types: 
byte -> Byte
short -> Short
int -> Integer
long -> Long
float -> Float
double -> Double
char -> Character
boolean -> Boolean

int a = 10;
Integer i = a;  // Autoboxing

*
Integer j = 10;
int b = j;  // Unboxing


*/
		
		
		
		
		
	}

}
