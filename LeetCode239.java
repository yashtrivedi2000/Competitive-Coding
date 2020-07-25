import java.util.Deque;
import java.util.LinkedList;

/**
 * 239
 */
public class LeetCode239 {

    public static void main(String[] args) {
        int[] arr={1,3,-1,-3,5,3,6,7};
        int[] ans=Solution3.maxSlidingWindow(arr, 3);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}

class Solution3 {
    public static int[] maxSlidingWindow(int[] a, int k) {
        if (a == null || a.length < k) 
                return null;
        Deque<Integer> dq=new LinkedList<>();
        int[] ans=new int[a.length-k+1];
        int i;
       for (i=0; i < k; i++) {
            while(!dq.isEmpty()&&a[dq.peekLast()]<a[i])
                    dq.removeLast();
                dq.addLast(i);
           }
           for (; i < ans.length; i++) {
                ans[i-k]=a[dq.peekFirst()];
                while ((!dq.isEmpty()) && dq.peek() <= i - k) 
                            dq.removeFirst(); 
                while(!dq.isEmpty()&&a[dq.peekLast()]<a[i])
                        dq.removeLast();
                    dq.addLast(i);
                    
               }
        ans[i-k]=a[dq.peekFirst()];
       return ans;
    }
}
