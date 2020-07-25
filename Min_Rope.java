import java.util.PriorityQueue;
import java.util.Scanner;


class Min_Rope {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test_cases=sc.nextInt();
        for (int i = 0; i < test_cases; i++) {
            int no_of_ropes=sc.nextInt();
            PriorityQueue<Long> queue =new PriorityQueue<>();
            for (int j = 0; j < no_of_ropes; j++) {
               queue.add(sc.nextLong());
            }
            long ans=0;
            long temp=0;
            for (int j = 0; j <= queue.size(); j++) {
                temp=queue.poll()+queue.poll();
                ans+=temp;
                queue.add(temp);
                System.out.println(queue);
            }
            System.out.println(ans); 
        }
    }
}