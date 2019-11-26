import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

class CodeChef 
{
    public static void main(String[] args) {
        System.out.println("Enter test cases: ");
        Scanner sc = new Scanner(System.in);
        int test_cases = sc.nextInt();
        String[] ipt = new String[test_cases];
        char[][] str = new char[test_cases][];
        for (int i = 0; i < test_cases; i++) {
            ipt[i] = sc.next();
            str[i] = ipt[i].toCharArray();
        }
        HashMap<Integer,HashMap<Character, Integer>> hm = new HashMap<Integer,HashMap<Character, Integer>>();
        for (int  i = 0; i < test_cases; i++)
         {
            hm.put(i,new HashMap<>());
            for (int j = 0; j < str[i].length; j++) 
            {
                for (int k = 0, m = 0; k < str[i].length; k++)
                 {
                    if (str[i][j] == str[i][k])
                        hm.get(i).put(str[i][j], m++);
                }
            }
            Integer maxValueInMap=(Collections.max(hm.get(i).values())); 
            for(Map.Entry entry: hm.get(i).entrySet()){
                if(maxValueInMap.equals(entry.getValue()))
                {
                    System.out.println(entry.getKey());
                    break; 
                }
                
            }
        sc.close();
        }
    }
}