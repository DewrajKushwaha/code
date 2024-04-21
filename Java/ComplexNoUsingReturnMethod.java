import java.util.*;
/**
 * comp
 */
 class comp {
    int r,i;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the real and Imaginary no.");
        r=sc.nextInt();
        i=sc.nextInt();

    }
    comp sum(comp c2)
    {
        comp t=new comp();
        t.r=r+c2.r;
        t.i=i+c2.i;
        return t;
    }
    void display()
    {
        System.out.println("Real= "+r);
        System.out.println(" Imeginary= "+i);
    }
}
public class ComplexNoUsingReturnMethod {
    public static void main(String[] args) {
        comp c1=new comp();
        comp c2=new comp();
        comp c3=new comp();
        c1.getdata();
        c2.getdata();
        c3=c1.sum(c2);
        c3.display();
    }
    
}
