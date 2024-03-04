import java.util.*;
public class operator {
    public static void main(String[] args) {
        System.out.println("__________Unary Operator___________");
        int i=10;
        int i2=-10;
        int i3=++i;
        int i4=i++;
        int i5=i--;
        int i6=--i;
        System.out.println("i= "+i);
        System.out.println("i2= "+i2);
        System.out.println("i3= "+i3);
        System.out.println("i4= "+i4);
        System.out.println("i5= "+i5);
        System.out.println("i6= "+i6);
        System.out.println("i= "+i);


        System.out.println("____________Binary Arithmetic Operator____________");
        int i7=10 +1;
        int i8 = i7 -1;
        int i9 =i8 / 2;
        int i10=i9 % 2;
        int i11=5 % 10;
        int i12=i10 * 3;

        System.out.println("i7 = "+i7); //11
        System.out.println("i8 = "+i8); //10
        System.out.println("i9 = "+i9); //5
        System.out.println("i10 = "+i10); //1
        System.out.println("i11 = "+i11); //5
        /* 10)5(0
         *    0
         * ------
         *    5 ans
         */
        System.out.println("i12 = "+i12); //3
        System.out.println("Hello "+"Dewraj");

        System.out.println("___________Assignment Operator_________");
        /*
        =
        +=
        -=
        *=
        /=
        %=
        */ 
        int i13=10;
        i13 *=3;
        System.out.println("i13 = " +i13);


        System.out.println("__________Relational Operators__________");
        /* 
        ==
        !=
        >=
        <=
        */ 
        int a=13;
        int b=19;
        System.out.println(b==a);


        System.out.println("_________Logical Operator_________");
        /* &
         * &&
         * |
         * ||
         * !
         * ^ 
        */
        int a2=3;
        int a3=4;

        if(true & a2>0){
            System.out.println(a2+2);
        }
        System.out.println(true &(a2>0));
      
      //  System.out.println(false &&(a2+1==a3));
        System.out.println(true |(4*0==1));
        System.out.println(true ||(4*0==1));
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        // System.out.println(false ^ false);
        // System.out.println(false ^ true);

        System.out.println();

    }
    

}
