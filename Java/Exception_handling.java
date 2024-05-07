import java.util.*;

/**
 * MyExc 
 */
 class MyExp extends Exception {
    MyExp(String s)
    {
        super(s);
    }
    
}

public class Exception_handling {
    public static void main(String[] args) {
        int x,y,z;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number");
        x=sc.nextInt();
        y=sc.nextInt();

        try {
            if (y==0) {
                throw new MyExp("The Number should not be divided by zero");
            }
            else
            {
                System.out.println("The result = "+(x/y));
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
    
}
