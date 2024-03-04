
import java.util.Scanner;

public class Oprators {
public static void main (String [] args){

    int a=10, b=12;
    Scanner sc =new Scanner(System.in);
  
    // arithmetic Operator
    System.out.println("Addition is : "+(a+b));
    System.out.println("Substraction is : "+(a-b));
    System.out.println("Multiplication is : "+(a*b));
    System.out.println("Devision is : "+(a/b));
    System.out.println("Modulus is : "+(a%b));
    
    // Assignment operators
    System.out.println("Modulus is : ");
    //
    System.out.println("~1 : "+~1);
    System.out.println(Integer.toBinaryString(1));
    System.out.println(Integer.toBinaryString(-2));
    System.out.println((byte)0b11111110);
    System.out.println((byte)0b10000000);
    System.out.println((byte)0b11000000);
}
    
}
