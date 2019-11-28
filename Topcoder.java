//A code which takes 2 numbers in input, the first one will be the our main number and the second input will be length of the output.
//The output will be the multiply of first number and its length will be given by user.
//The condition is the output should not contain more than 4 distinct numbers.
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

class Topcoder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System. in);
        System.out.println("Enter a number: ");
        String num = sc.next();//Our number
        System.out.println("Enter length of multiply: ");
        int len = sc.nextInt();//Length of output
        System.out.println("Number is: " + findAns(num, len));
        sc.close();
    }
    static String findAns(String number, int length) //The function will return the number 
    { 
        HashSet<Integer> hs = new HashSet<Integer>();//To count distinct digits from our output numbers
        int k = 1,temp_num;// K for multiplication and temp_num will store our intermediate numbers before output
        int original_number = Integer.parseInt(number);
        do {
            hs.clear();
            temp_num = original_number * k;//Will multiply original number with k, where k=1,2,3,...
            number = Integer.toString(temp_num);//This will convert our number into string
            for (int i = 0; i < number.length(); i ++) 
                hs.add((int)number.charAt(i));
            
            k ++;
        } while (hs.size() > 4);// Check whether 4 distinct  number are there or more
        //If length came after multiplication is lesser, then below loop will append 0s into that number
        while (number.length() < length) {
            number += '0';
        }
        return number;
    }
}
