import java.util.*;

/**
 * menu_driven
 */
public class menu_driven {

    public static void main(String[] args) {
        int choice = 0, car = 0, motercy = 0, cycle = 0, total = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("######## Welcome in out my vehical system ########");
        do {

            System.out.println(" Press 1. For Car");
            System.out.println(" Press 2. For Moter Cycle");
            System.out.println(" Press 3. For Cycle");
            System.out.println(" Press 4. Total Amount ");
            System.out.println(" Press 5. For Exit ");
            System.out.println("Enter your choice ");
            choice = sc.nextInt();

            // menu start here
            switch (choice) {
                case 1:
                    System.out.println(" Your Car is Parked \n ");
                    car++;
                    break;
                case 2:
                    System.out.println(" Your Moter Cycle is Parked \n ");
                    motercy++;
                case 3:
                    System.out.println(" Your  Cycle is Parked \n ");
                    cycle++;
                case 4:
                    // calculating parking amount
            
                    total = car * 50 + motercy * 10 + cycle * 10;
                    System.out.println("The Total Amount is = " + total);
                case 5:
                    break;
                default:
                    System.out.println("Invalid Choice !!!! ");
                    break;
            }

        } while (choice != 5);
    }
}