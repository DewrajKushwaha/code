/* Write a program by using thread . The output will be dead when i==5 in first thread  and  in second thread the program will be gone in sleep for 1 second when i==15 */
import java.util.*;

class th1 extends Thread{
    int i;
    public void run()
    {
        for ( i = 1; i <=10; i++) {
            if (i==5) {
                System.out.println("The first thread is dead .");
                stop();
            }
            else
            System.out.println(i);
        }
    }
}

class th2 extends Thread{
    int i;
    public void run()
    {
        for ( i = 11; i <=20; i++) {
            if (i==15) {
                System.out.println("The second thread is going to sleep for 1 second .");
                try{
                    sleep(1000);
                    throw new Exception(" Are Bhai Yha Error Aaya tha");
                }
                catch(Exception e)
                {
                    System.out.println(e.getMessage());
                }
            }
            else
            System.out.println(i);
        }
    }
}

public class Multi_Thread_By_Using_Method {
    public static void main(String[] args) {
        th1 obj1=new th1();
        th2 obj2=new th2();
        obj1.start();
        obj2.start();
    }
    
}
