import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

/**
 * GFG2
 */
public class GFG2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String result[] = new String[size];
        String str1, str2;

        for (int i = 0; i < size; i++) {
            str1 = sc.next();
            str2 = sc.next();
            ArrayList<Character> al1 = new ArrayList<Character>();
            ArrayList<Character> al2 = new ArrayList<Character>();
            char arr1[] = str1.toCharArray();
            char arr2[] = str2.toCharArray();
            

            for (char ch : arr1) {
                al1.add(ch);
            }
            for (char ch : arr2) {
                al2.add(ch);
            }

            for (int j = 0; j < Math.max(str1.length(), str2.length()); j++) {

                if (j < al1.size()) {
                    if (al1.get(j) == '#') {
                        al1.set(j - 1, (char) (al1.get(j - 1) + 1));
                        al1.remove(j);
                        j--;

                    }
                }
                if (j < al2.size()) {
                    if (al2.get(j) == '#') {
                        al2.set(j - 1, (char) (al2.get(j - 1) + 1));
                        al2.remove(j);
                        j--;
                    }
                }
            }

            if (al1.equals(al2)) {
                result[i] = "Yes";
            } else {
                result[i] = "No";
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        sc.close();
    }
}