import java.util.*;
class Comp
{
    int r,i;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter real no and imaginary no. ");
        r=sc.nextInt();
        i=sc.nextInt();
    }
    void sum(Comp c2)
    {
        r=r+c2.r;
        i=i+c2.i;
    }
    void display()
    {
        System.out.println(" Real no = "+r);
        System.out.println(" Imaginary no = "+i);
    }
}
public class ComplexNo {
    public static void main(String[] args) {
        Comp c1=new Comp();
        Comp c2=new Comp();
        c1.getdata();
        c2.getdata();
        c1.sum(c2);
        c1.display();

    }
    
}
