import java.util.*;
/**
 * avg
 */
 class avg {
    int x,y,z,av;
    void getdata(int a,int b,int c)
    {
        x=a;
        y=b;
        z=c;
    }
    void avg1()
    {
        av=(x+y+z)/3;
    }
    void display()
    {
        System.out.println(" The avg marks is ="+av);
    }
}
public class AvgMarksOOPs {
    public static void main(String[] args) {
        avg obj=new avg();
        obj.getdata(50, 70, 80);
        obj.avg1();
        obj.display();
    }
    
}
