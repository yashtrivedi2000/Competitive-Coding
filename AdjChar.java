
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AdjChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> hm = new HashMap<>();
        String s = sc.next();
        char ch;
        ArrayList<Character> al = new ArrayList<>();
        
        createHashMap(hm, s);
        
        for (int i = 0; hm.size()!=2; i++) {
            i = i % hm.size();
            ch = (Character) hm.keySet().toArray()[i];

            if (hm.get(ch) > 0) {
                al.add(ch);
                hm.replace(ch, hm.get(ch) - 1);
            }
            if (hm.get(ch) == 0) {
                hm.remove(ch);
            }
        }
            if (Math.abs(hm.get(hm.keySet().toArray()[0]) - hm.get(hm.keySet().toArray()[1])) > 1) {
                exitHere();
            } else {
                for (int k = 0; hm.isEmpty() != true; k++) {
                    k = k % hm.size();
                    ch = (Character) hm.keySet().toArray()[k];

                    if(hm.get(ch)!=0) {
                        al.add(ch);
                        hm.replace(ch, hm.get(ch) - 1);
                    }
                    if (hm.get(ch) == 0)
                    {
                        hm.remove(ch);
                        if(hm.size()==1)
                        if(hm.get(hm.keySet().toArray()[0])>1)
                        {
                            exitHere();
                        }
                    }       
                }
                s=al.toString();
                System.out.println(s);
                System.exit(0);
            }
        sc.close();
    }
    public static void exitHere() {
        System.err.println("Answer isn't possible here!!");
        System.exit(0);
    }
    public static void createHashMap(HashMap<Character, Integer> hm, String s) {
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (hm.containsKey(ch))
                hm.replace(ch, hm.get(ch) + 1);
            else
                hm.put(ch, 1);
        }
    }
}
