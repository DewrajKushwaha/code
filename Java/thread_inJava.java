import java.util.Scanner;
/**
 * th1  
 */
 class th1 extends Thread {
    int i;
    public void run(){
        for ( i = 1; i <=10; i++) {
            System.out.println(i);
        }
    }
    
}
 class th2 extends Thread {
    int i;
    public void run(){
        for ( i = 11; i <=20; i++) {
            System.out.println(i);
        }
    }
    
}
public class thread_inJava {
    public static void main(String[] args) {
        th1 obj1=new th1();
        th2 obj2=new th2();
        obj1.start();
        obj2.start();
    }
}
