import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Playfair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String plain_text = sc.nextLine();
        String key = sc.nextLine();
        char ch1, ch2;
        System.out.println(generateMatrix(key)); 
        String encrypted_text;
        // for (int i = 0; i < plain_text.length(); i++) {
        //         ch1=plain_text.charAt(i);
        //         ch2=plain_text.charAt(i++);
        //         if(ch1==ch2){
        //             ch2='X';
        //             i--;
        //         }
        //}

        sc.close();

    }

    public static ArrayList<ArrayList<Character> > generateMatrix(String key) {
         ArrayList<ArrayList<Character> > matrix 
            = new ArrayList<ArrayList<Character>>();
        
        char ch;
        matrix.add(new ArrayList<Character>());
        matrix.add(new ArrayList<Character>());
        matrix.add(new ArrayList<Character>());
        matrix.add(new ArrayList<Character>());
        matrix.add(new ArrayList<Character>());
        for (int i = 0; i < key.length(); i++) {
            ch = key.charAt(i);
            if (!(matrix.get(0).contains(ch) || ch == 'J'|| matrix.get(1).contains(ch)))
                matrix.get(Math.abs(i/6)).add(ch);
        }
        for (char i = 'A'; i < '['; i++) {
            if (!(matrix.get(0).contains(i) || i == 'J' || matrix.get(1).contains(i)))
            matrix.get(Math.abs(matrix.size()/6)).add(i);
        }
        return matrix;
    }
}