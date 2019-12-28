import java.util.Scanner;


public class GFG1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        int count = 0, flag = 0;
        for (int i = 0; i < testcase; i++) {
            int size = sc.nextInt();
            int arr[] = new int[size];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }
            for (int j = 1; j < arr.length; j++) {
                while (arr[j] - arr[j - 1] == 1) {
                    flag = 1;
                    if (j < (arr.length - 1))
                        j++;
                    else
                        break;
                }
                count += flag;
                flag = 0;
            }
            System.out.println(count);
        }
        sc.close();
    }
}