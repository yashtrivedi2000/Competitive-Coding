import java.util.Scanner;

/**
 * Addition of 2 numbers without using Arithmatic Operators.
 */
public class Addition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int carry;
        sc.close();
        while(b!=0)
        {
            carry=a&b;//Contains common bits of x and y.
            a=a^b;//XOR gives base, thus our addition will be stored in a.
            b=carry<<1;//Every time carry will be shifted by 1 bit at left side.
        }
        System.out.println("Adddition is: "+a);// As result is stored in a
    }
    
}