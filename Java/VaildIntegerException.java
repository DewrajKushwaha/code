import java.util.*;

public class VaildIntegerException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, c = 0;
        do {
            System.out.println("Enter a number");
            try {
                num = sc.nextInt();
                System.out.println("You entered " + num);
                c++;
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input . Are dada number dalna tha.");
                sc.next();// clear the invalid input
            }
        } while (c == 0);
    }
}
