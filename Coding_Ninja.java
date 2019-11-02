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
        boolean b;
        int first_key=0,sec_key=0;
        for(int i=0;i<9;i++)
        {
            loc_var=extra_number-hm.get(i);
            if(loc_var!=hm.get(i))
            {
                b=hm.containsValue(loc_var);
                if(b==true)
                {
                    for(int k=0;k<9;k++)
                    {
                        if(hm.get(k)==loc_var)
                        {
                        sec_key=hm.get(k);
                        first_key=hm.get(i);
                        }
                        
                    }
                    break;
                }
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