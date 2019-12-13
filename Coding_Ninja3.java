import java.util.HashMap;
import java.util.Scanner;

/*Best Friends
Send Feedback
Since master Hulk has started ranking his N students, the number of friendships in his class has sharply fallen. The students near the bottom of the rankings list have become jealous of the top students, while the top students started looking down on their less successful colleagues.
According to Hulk's observations, the following rule holds: two students are friends if their ranks are close enough, more precisely, if they differ by at most K. For example, if K = 1, then only neighbouring students on the rankings list are friends. Furthermore, two students are best friends if they are friends and their names have the same length.
Write a program to calculate the number of pairs of best friends in this gifted class.
Input Format:
The first line of input contains two positive integers, N and K, from the problem statement.
Each of the following N lines contains a single student's name. The names are given in the order they appear on the rankings list. They consist of between 2 and 20 (inclusive) uppercase English letters.
Constraints:
1 ≤ N ≤ 300000
1 ≤ K ≤ N
2<=|S| <=20 (length of string)
Time limit: 1 sec
Output Format:
The first and only line of output must contain the required number of pairs.
Sample Input 1:
4 2
IVA
IVO
ANA
TOM
Sample Output 1:
5
Sample Input 2;
6 3
CYNTHIA
LLOYD
STEVIE
KEVIN 
MALCOLM
DABNEY
Sample Output 2:
2*/

public class Coding_Ninja3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N and K: ");
        int N = sc.nextInt();
        int K = sc.nextInt();
        System.out.println("Enter names:");
        String[] Names = new String[N];
        for (int i = 0; i < N; i++)
            Names[i] = sc.next();
        sc.close();
        makePair(N, K, Names);
    }

    static void makePair(int N, int K, String[] Names) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0, addpair = 0;
        for (int i = 0; i < Names.length; i++) {
            if (hm.containsKey(Names[i].length()))
                hm.put(Names[i].length(), hm.get(Names[i].length()) + 1);
            else
                hm.put(Names[i].length(), 1);

            if (i > K && hm.containsKey(Names[i].length()) && (count = hm.get(Names[i].length())) > 1) {
                if (Names[i].length() == Names[i - K].length())
                    count--;
                if (count > 1)
                    addpair++;
            }
        }
        System.out.println((N / K) + 1 + addpair);
    }

}