//A code to find 7 numbers out of 9 to make a sum of 100.
import java.util.HashMap;
import java.util.Scanner;

class Coding_Ninja
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ans=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<9;i++)
        {
            hm.put(i,sc.nextInt());
            ans+=hm.get(i);
        }
        int extra_number=ans-100,loc_var=0;
        int first_key=0,sec_key=0;
        for(int i=0;i<9;i++)
        {
            loc_var=extra_number-hm.get(i);
                if(hm.containsValue(loc_var) && loc_var!=hm.get(i))
                {
                    sec_key=loc_var;
                    first_key=hm.get(i);
                    break;
                }
                if(i==8)
                {
                    System.out.println("NO ans found");
                    System.exit(0);
                }
        }
        for(int i=0;i<9;i++)
        {
            if(hm.get(i)!=first_key&&hm.get(i)!=sec_key)
                
                System.out.println(hm.get(i));
        }
        sc.close();
    }
}