//the condition is not useing thread class
import java.util.*;

class arms implements Runnable{
    private int arm=0;
    public void run(){
        int i,res;
        for(i=1;i<=1000;i++)
        {
            int j=i;
            arm=0;
            while (j>0) {
                res=j%10;
                arm +=Math.pow(res, 3);
                j=j/10; 
            }
            if (i==arm) {
                System.out.println("The Armstong number is : "+i);
            }
        }
    }
}
/**
 * prime
 */
 class prime implements Runnable{
    public void run(){
        int n,i;
        for(n=50;n<=100;n++)
        {
            int c=0;
            for ( i = 1; i <=n; i++) {
                if (n%i==0) {
                    c++;
                }
            }
            if (c==2) {
                System.out.println("The Prime number is : "+n);
            }
        }
    }

    
}


public class ArmAndPrimeUsingThread {
    public static void main(String[] args) {
        arms obj1=new arms();
        prime obj2=new prime();
        Thread obj11=new Thread(obj1);
        obj11.start();
        Thread obj21=new Thread(obj2);
        obj21.start();
    }
}
