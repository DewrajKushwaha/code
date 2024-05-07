// /*
// Dewraj Kumar Kushwaha
// */ 

// import java.util.Scanner;
// /**
//  * firstLaterCapital
//  */
// public class firstLaterCapital {

//     public static void main(String[] args) {
//         String s1=" ";
//         String s2="";
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a line of code");
//         s1=sc.nextLine();
//         int l=s1.length();
//         for (int i = 0; i < l; i++) {

//             if (s1.charAt(i) !=' ') {
//                 s1 +=s1.charAt(i);
//             } 
//             else
//             {
//                 s1=s1.substring(0,1).toUpperCase()+s1.substring(1);
//                 System.out.print(s1+" ");
//             }    
//         }
//     }
// }

import java.util.Scanner;
public class Strings {
    public static void main(String args[]) {
        String s1 = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line of code: ");
        s1 = sc.nextLine();
        int l=s1.length();
        for (int i = 0; i < l; i++) {
            if (s1.charAt(i) !=' ') {
                s1 +=s1.charAt(i);
            }
            else
            {
                s1=s1.substring(0,1).toUpperCase()+s1.substring(1);
                System.out.print(s1+" ");
            }
        }
       
    }
}