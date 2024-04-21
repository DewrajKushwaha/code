import java.util.*;

/**
 * A
 */
class A {

    int x, y;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
        x = sc.nextInt();
        y = sc.nextInt();
    }
}

class B extends A {
    int m,z;
    void getdata2()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter any number");
        m=sc.nextInt();
    }
    void cal()
    {
        z=x*y+m;
    }
    void display()
    {
        System.out.println(" Result = "+z);
    }

}

public class SingleInheritance {
public static void main(String[] args) {
    B obj=new B();
    obj.getdata();
    obj.getdata2();
    obj.cal();
    obj.display();
}
}
