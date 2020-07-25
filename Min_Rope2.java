import java.util.PriorityQueue;
import java.util.Scanner;

public class Min_Rope2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_cases = sc.nextInt();
        for(int k=0;k<test_cases;k++){
        PriorityQueue<Long> q = new PriorityQueue<>();
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            q.add(sc.nextLong());
        }
        long sum = 0;
        while (q.size() != 1) {
            long x = q.remove();
            long y = q.remove();
            sum = sum + (x + y);
            q.add(x + y);
            System.out.println(q);
        }
        System.out.println(sum);
        }
	
    }
}