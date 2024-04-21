
 class A {
    int x,z,y;
    void getdata(int a,int b)
    {
        x=a;
        y=b;

    }
    void cal()
    {
        z=x*y;
    }
    void display()
    {
        System.out.println(" The multiplication = "+z);
    }
    
}
public class MultipyingTwoNoUsingOOPS {
    public static void main(String[] args) {
        A obj=new A();
        obj.getdata(2, 4);
        obj.cal();
        obj.display();
        
    }
}
