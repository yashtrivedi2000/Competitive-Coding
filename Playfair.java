import java.util.ArrayList;
import java.util.Scanner;

public class Playfair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String plain_text = sc.nextLine();
        String key = sc.nextLine();
        
        ArrayList<Character> encrypted_text=generateMatrix(key);
        System.out.println(encryptText(encrypted_text,plain_text));
        sc.close();

    }
    public static String encryptText(ArrayList<Character>  matrix, String plainText){
        String encryptedString="";
        char ch1, ch2;
        int horizontal_pos1,horizontal_pos2,final_pos1,final_pos2,vertical_pos1,vertical_pos2;
        for (int i = 0; i < plainText.length(); i++) {
            ch1=plainText.charAt(i);
            ch2=plainText.charAt(++i);
            if(ch2==ch1){
                --i;
                ch2='X';
            }
            horizontal_pos2 = matrix.indexOf(ch2)%5;
            horizontal_pos1 = matrix.indexOf(ch1)%5;
            vertical_pos2 = (Math.abs(matrix.indexOf(ch2)/5))*5;
            vertical_pos1 = (Math.abs( matrix.indexOf(ch1)/5))*5;
            if(horizontal_pos2==horizontal_pos1){
                final_pos1=(horizontal_pos1+5)%25;
                final_pos2=(horizontal_pos2+5)%25;
                encryptedString+=matrix.get(final_pos1);
                encryptedString+=matrix.get(final_pos2);
            }
            else if(vertical_pos1==vertical_pos2){
                horizontal_pos1++;
                horizontal_pos2++;
                
                if(horizontal_pos1>4)
                    horizontal_pos1-=5;
                if(horizontal_pos2>4)
                    horizontal_pos2-=5;
                encryptedString+=matrix.get(horizontal_pos1+vertical_pos1);
                encryptedString+=matrix.get(horizontal_pos2+vertical_pos2);
            }
            else{
                final_pos1=(horizontal_pos2)+vertical_pos1;
                final_pos2=(horizontal_pos1)+vertical_pos2;
                encryptedString+=matrix.get(final_pos1);
                encryptedString+=matrix.get(final_pos2);
            }
        }
        return encryptedString;

    }
    public static ArrayList<Character>  generateMatrix(String key) {
         ArrayList<Character>  matrix 
            = new ArrayList<Character>();
        char ch;
        for (int i = 0; i < key.length(); i++) {
            ch = key.charAt(i);
            if (!(matrix.contains(ch) || ch == 'J'))
                matrix.add(ch);
        }
        for (char i = 'A'; i < '['; i++) {
            if (!(matrix.contains(i) || i == 'J'))
                matrix.add(i);
        }
        System.out.println(matrix);
        return matrix;
    }
}