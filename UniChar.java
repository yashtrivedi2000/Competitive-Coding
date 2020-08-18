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
        try {
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch < 65 || ch > 122 || (ch > 90 && ch < 97)) {
                    throw new Exception("Invalid character" + ch);
                }
                if (hm.containsKey(ch))// If already character is encountered
                    hm.put(ch, hm.get(ch) + 1);
                else
                    hm.put(ch, 1);// If the word comes first time, its freq should be 1.
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(hm);
        sc.close();
    }

}