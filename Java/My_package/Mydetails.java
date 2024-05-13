package My_package;

import java.util.*;

public class Mydetails {
    public String name = " ";
    public String fathername = " ";
    public String dob = " ";
    public String add = " ";
    public long mob;
    public int matric, myear;
    public int inter, iyear;

    public void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        name = sc.nextLine();
        System.out.println("Enter your father name");
        fathername = sc.nextLine();
        System.out.println("Enter your Date of Birth");
        dob = sc.nextLine();
        System.out.println("Enter your Mobile no");
        mob = sc.nextLong();
        System.out.println("Enter your Home Town");
        add = sc.next();

    }

    public void matric() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Year of matric ");
        myear = sc.nextInt();
        System.out.println("Enter your matric marks");
        matric = sc.nextInt();
        
    }

    public void inter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Year of inter ");
        iyear = sc.nextInt();
        System.out.println("Enter your inter marks");
        inter = sc.nextInt();
    }

    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
