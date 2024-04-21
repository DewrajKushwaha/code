import java.util.*;
class Student{
    int id;
    String name;
    int age;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the roll no,name and age");
        id=sc.nextInt();
        name=sc.nextLine();
        age=sc.nextInt();
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
}
class Result extends Subject implements Sport
{
    int sm;
    int total=0;
    void getdata3()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of sport");
        sm=sc.nextInt();
    }
    public void display()
    {
        System.out.println(" Roll no : "+id);
        System.out.println(" Name    : "+name);
        System.out.println(" Age    : "+age);
        total=sub1+sub2;
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
