
// Program to enter a number from keyboard and convert it into binary form and vice-versa.
/**
 * data
 */
import java.util.*;

class DecToBin {
    int x, i;
    int bin[] = new int[16];

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        x = sc.nextInt();

    }

    void calc() {
        for (i = 0; x > 0; i++) {
            bin[i] = x % 2;
            x = x / 2;
        }

    }

    void display() {
        System.out.println("Binary number is : ");
        for (i = i - 1; i >= 0; i--) {
            System.out.print(" " + bin[i]);
        }
    }

}

/**
 * BinTo3Dec
 */
class BinToDec {
    String num;
    int i, x;
    int flag = 0;
    int bin[] = new int[32];

    void getdata2() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter your binary number");
        num = sc.nextLine();
        x = Integer.parseInt(num);
    }

    int n = 0;

    void calc2() {
        for (i = 0; x > 0; i++) {
            i = x % 10;
            x = x / 10;
            n += Math.pow(2, i);
            if (i > 1) {
                flag++;
            }

        }

    }

    void display2() {
        if (flag > 0) {
            System.out.println(" Please enter a valid Binary Number");
        } else {
            System.out.println("The Decimal value is : " + n);
        }

    }
}

/**
 * DecToBin_Converstion
 */
public class DecToBin_Converstion {

    public static void main(String[] args) {
        DecToBin obj = new DecToBin();
        BinToDec obj2 = new BinToDec();

        obj.getdata();
        obj.calc();
        obj.display();
        obj2.getdata2();
        obj2.calc2();
        obj2.display2();
    }
}