import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

class Topcoder
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        String num=sc.next();
        System.out.println("Enter length of multiply: ");
        int len=sc.nextInt();
        System.out.println("Number is: "+findAns(num,len));
        sc.close();
    }
    static String findAns(String number,int length)
    {
        HashSet<Integer> hs=new HashSet<Integer>();
        int k=1;
        int num,temp_num;
        int original_number=Integer.parseInt(number);
        do
        {
            hs.clear();
            temp_num=original_number*k;
            number=Integer.toString(temp_num);
            for(int i=0;i<number.length();i++)
            hs.add((int)number.charAt(i));
            k++;
        }while(hs.size()>4);
        while(number.length()<length)
        {
            number+='0';
        }
        return number;
    }
}