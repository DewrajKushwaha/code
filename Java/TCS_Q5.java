import java.util.*;

public class TCS_Q5 {
    public static void main(String[] args) {
        int  s1, s2, s3, s4, s5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of five subject");
        s1 = sc.nextInt();
        s2 = sc.nextInt();
        s3 = sc.nextInt();
        s4 = sc.nextInt();
        s5 = sc.nextInt();
        int sum = s1 + s2 + s3 + s4 + s5;
        float per=(sum*100)/500;
        System.out.println("The total number is : "+sum);
        System.out.println("The total percentage is : "+per+"%");

    }
}