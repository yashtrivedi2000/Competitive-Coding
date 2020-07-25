/**
 * LeetCode33
 */
public class LeetCode33 {

    public static void main(String[] args) {
        int arr[]={4,6,7,0,1,2};
        System.out.println(Solution.search(arr, 4)); 
    }

    static class Solution {
        public static int search(int[] a, int target) {
            int low=0;
            int high = a.length-1;
            int mid;
            while(low<=high){
                mid=(high+low)/2;
                if(a[mid]==target)
                    return mid;
                if(a[low]<target)
                        high=mid-1;
                else
                    low=mid+1;

            }
            return -1;
        }
    }
}