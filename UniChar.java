import java.util.HashMap;
import java.util.Scanner;

/**
 * Count unique charcter with their frequency using HashMap.
 */
public class UniChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashMap<Character, Integer> hm = new HashMap<>();// The mapping will be like Charcter->Frequency(in integer)
        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i)))// If already character is encountered
                hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);// hm.get will give the prev freq. , we will add 1 to it.
            else
                hm.put(s.charAt(i), 1);// If the word comes first time, its freq should be 1.
        }
        System.out.println(hm);
        sc.close();
    }

}