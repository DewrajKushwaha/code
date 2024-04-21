import java.util.*;
class time{
    int h,m;
    void gettime()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter time in hour and minutes");
        h=sc.nextInt();
        m=sc.nextInt();
    } 
    time cal(time c2)
    {
        time t=new time();
        t.h=h+c2.h;
        t.m=m+c2.m;
        return t;
    }
    void display()
    {
        while (m>=60) {
            m=m-60;
            h++;
        }
        System.out.println("Hour : "+h);
        System.out.println("Mintue : "+m);
    }

}
public class AddingTime {
    public static void main(String[] args) {
        time ob=new time();
        time ob2=new time();
        time ob3=new time();
        ob.gettime();
        ob2.gettime();
        ob3=ob.cal(ob2);
        ob3.display();


    }
}
