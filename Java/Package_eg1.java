import My_package.*;
import java.util.*;
class details extends Mydetails{
    String s1="";
    int rollno;
    
    void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Current Degree name");
        s1=sc.nextLine();
        System.out.println("____________ My Details___________");
        System.out.println(" Name \t : "+name);
        System.out.println(" Father Name \t : "+fathername);
        System.out.println(" Higest Qualification is \t  : "+s1);
        System.out.println(" Contact number is \t : "+mob);
        System.out.println(" Date of Birth is \t : "+dob);
        System.out.println(" Tota marks in Matrix \t : "+matric);
        System.out.println(" Year of  Matrix \t : "+myear);
        System.out.println(" Tota marks in Inter \t : "+inter);
        System.out.println(" Year of  Inter \t : "+iyear);
    }
}

class Package_eg1 {
    public static void main(String[] args) {
        details obj=new details();
       obj.getDetails();
      obj.matric();
      obj.inter();
      obj.getdata();
      
    }
}
