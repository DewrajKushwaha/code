import java.util.*;
class Student{
    int id;
    String name;
    int age;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the roll no");
        id=sc.nextInt();
    }
}
class Subject extends Student
{
    int sub1,sub2;
    void getdata2()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of subject 1 and subject 2");
        sub1=sc.nextInt();
        sub2=sc.nextInt();
    }
}
/**
 * Sport
 */
 interface Sport {
    void display();
    void getdata3();
}
class Result extends Subject implements Sport
{
    int sm;
    int total=0;
   public void getdata3()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of sport");
        sm=sc.nextInt();
    }
    public void display()
    {
        System.out.println(" Roll no : "+id);
        total=sub1+sub2+sm;
        System.out.println("The Total marks is = "+total);
    }
    
}
public class MultipleInhertence {
    public static void main(String[] args) {
        Result obj=new Result();
        obj.getdata();
        obj.getdata2();
        obj.getdata3();
        obj.display();
    }
}
