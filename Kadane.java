import java.util.Scanner;

/**
 * Kadane
 */
public class Kadane {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(KadaneAlgo(arr));
        sc.close();
    }

    static int KadaneAlgo(int[] arr) {
        int max_glob, max_loc;
        max_glob = max_loc = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max_loc = Math.max(arr[i], arr[i] + max_loc);
            if (max_loc > max_glob)
                max_glob = max_loc;
        }
        return max_glob;
    }
}