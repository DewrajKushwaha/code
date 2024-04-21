import java.util.*;
class A{
    int x,y,z;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number");
        x=sc.nextInt();
        y=sc.nextInt();
    }
    void cal()
    {
        z=x+y;
    }
    void display()
    {
        System.out.println(" The Sum = "+z);
    }
}
public class AddingTwoNoUsingOOPS {
    public static void main(String[] args) {
    
        A obj=new A();
        obj.getdata();
        obj.cal();
        obj.display();
    }
    
}
