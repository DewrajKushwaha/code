import java.util.*;
public class TCS_15 {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String ch;
        System.out.println("Enter the first three latter of day LIKE (Mon,Tue....)");
        ch=sc.nextLine();
        switch (ch) {
            case "mon":
            case "Mon":
            case "MON": System.out.println("The Day is Monday");
                break;
    
            case "tue":
            case "Tue":
            case "TUE": System.out.println("The Day is Tuesday");
                break;
    
            case "wed":
            case "Wed":
            case "WED": System.out.println("The Day is Wednesday");
                break;
    
            case "Thu":
            case "thu":
            case "THU": System.out.println("The Day is Thursday");
                break;
    
            case "Fri":
            case "fri":
            case "FRI": System.out.println("The Day is Friday");
                break;
    
            case "sat":
            case "Sat":
            case "SAT": System.out.println("The Day is Saturday");
                break;
    
            case "sun":
            case "Sun":
            case "SUN": System.out.println("The Day is Sunday");
                break;
                default:
                System.out.println("Wrong input");
                break;
        }

    }
}