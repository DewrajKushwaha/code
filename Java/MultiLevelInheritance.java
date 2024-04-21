import java.util.*;

/**
 * Student
 */
class Student {
    int rollno;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll no.");
        rollno = sc.nextInt();

    }

}

class subject extends Student {
    int sub1,sub2;
    void getdata2()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 subject marks");
        sub1=sc.nextInt();
        sub2=sc.nextInt();
    }

}
class Result extends subject
{
    int total;
    void cal()
    {
        total=sub1+sub2;
    }
    void display()
    {
        System.out.println("Roll no =" +rollno);
        System.out.println("Total no =" +total);
    }
}

public class MultiLevelInheritance {
public static void main(String[] args) {
    Result ob=new Result();
    ob.getdata();
    ob.getdata2();
    ob.cal();
    ob.display();
}
}
