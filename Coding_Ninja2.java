import java.util.Scanner;

class Coding_Ninja2
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter test cases: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter 1st string: ");
            String s1 = sc.next();
            System.out.println("Enter 2nd string: "); 
            String s2 = sc.next();
            s1=s1.toUpperCase(); 
            char[] X=s1.toCharArray(); 
            char[] Y=s2.toCharArray(); 
            int m = X.length; 
            int k = Y.length; 
            if(lcs( X, Y, m, k )==s2.length())
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }
        }
        sc.close();
    }

    static int lcs( char[] X, char[] Y, int m, int n ) 
    { 
        if (m == 0 || n == 0) 
        return 0; 
        if (X[m-1] == Y[n-1]) 
        return 1 + lcs(X, Y, m-1, n-1); 
        else
        return max(lcs(X, Y, m, n-1), lcs(X, Y, m-1, n)); 
    }

    static int max(int a, int b) 
    { 
        return (a > b)? a : b; 
    } 
}



