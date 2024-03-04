public class TCS_21 {
    public static void main(String[] args) {
        int a=1,b=1,c=0;
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<=10;i++)
        {
            c=a+b;
            if(c<100)
            {
                System.out.println(c);
            }
            a=b;
            b=c;

        }
    }
    
}
