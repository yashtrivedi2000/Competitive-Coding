
//A code to clear lsb to ith bit.
import java.util.Scanner;

class BitManip1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println("Select ith bit");
        int b = sc.nextInt();
        sc.close();
        int mask = ~((1 << b + 1) - 1);
        a &= mask;
        System.out.println("After clearing upto ith bit ans is: " + a);
    }
}