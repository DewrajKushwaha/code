/**
 *      Number of Character 
        Number of spaces
        Number of words 
        Number of Vowel 
        Number of Conconent
*/
import java.util.*;
public class string_methods {
    public static void main(String[] args) {
        int x=0,count=0,l;
        String str1,str2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line: ");
        str1 = sc.nextLine();
        str1=str1.trim();
        l=str1.length();
        str1=str1.toLowerCase();
        for (int i = 0; i <l; i++) {
            if (str1.charAt(i)==' ') {
                count++;
            }
            if (str1.charAt(i)=='a' || str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u') {
               x++; 
            }
        }
        System.out.println("Number of Character "+l);
        System.out.println("Number of spaces: "+count);
        System.out.println("Number of words "+(count+1));
        System.out.println("Number of Vowel "+x);
        System.out.println("Number of Conconent "+(l-x));
        
    }
}
