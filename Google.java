import java.util.Scanner;

public class Google {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of operation:");
        String[] type = new String[sc.nextInt()];
        int index = 0;
        System.out.println("Enter operations[Left, Right]:");
        for (int i = 0; i < type.length; i++) {
            type[i] = sc.nextLine();
        }
        for (int i = 0; i < type.length; i++) {
            if (type[i].equals("Left")) {
                index = (index + 1) % arr.length;
            } else {
                index--;
                if (index < 0) {
                    index = arr.length - 1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[(i + index) % arr.length]);
        }
        sc.close();
    }
}