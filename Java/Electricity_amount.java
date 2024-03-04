import java.util.*;

/**
 * Electricity amount
 * unit consume Rate/unit
 * 1-100 5
 * 101-500 8
 * above 500 10
 */
public class Electricity_amount {
    public static void main(String[] args) {
        int Total, unit, rate, x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the consumed electricity unit : ");
        unit = sc.nextInt();

        // converting process
        if (unit > 100) {
            x = unit - 100;
            if (x >400) {
                y = x - 400;
                Total = 100 * 5 + 400 * 8 + y * 10 + 150;
            } else {
                Total = 100 * 5 + x * 8 + 150;
            }
        }
        else
        {
            Total=unit*5;
        }

        System.out.println("Total amount is "+Total);
    }

}