import java.util.ArrayList;
import java.util.Scanner;

public class Playfair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter plain text:");
        String plain_text = sc.nextLine();
        System.out.println("Enter key:");
        String key = sc.nextLine();
        ArrayList<Character> encrypted_text = generateMatrix(key);
        System.out.println("Encrypted text is: "+encryptText(encrypted_text, plain_text));
        sc.close();
    }

    public static String encryptText(ArrayList<Character> matrix, String plainText) {
        String encryptedString = "";
        char ch1, ch2;
        int horizontal_pos1, horizontal_pos2, final_pos1, final_pos2, vertical_pos1, vertical_pos2;
        for (int i = 0; i < plainText.length(); i++) {
            ch1 = plainText.charAt(i);
            ch2 = plainText.charAt(++i);
            if (ch2 == ch1) {
                --i;
                ch2 = 'X';
            }
            horizontal_pos2 = matrix.indexOf(ch2) % 5;
            horizontal_pos1 = matrix.indexOf(ch1) % 5;
            vertical_pos2 = (Math.abs(matrix.indexOf(ch2) / 5)) * 5;
            vertical_pos1 = (Math.abs(matrix.indexOf(ch1) / 5)) * 5;
            // If they are in same column, we shift down side so by the equation we will
            // achieve that in below case.
            if (horizontal_pos2 == horizontal_pos1) {
                final_pos1 = (horizontal_pos1 + 5) % 25;
                final_pos2 = (horizontal_pos2 + 5) % 25;
                encryptedString += matrix.get(final_pos1);
                encryptedString += matrix.get(final_pos2);
            }
            // Below case is when both are in same row, so we right shift the character
            else if (vertical_pos1 == vertical_pos2) {
                horizontal_pos1++;
                horizontal_pos2++;
                // If character goes out of row, we need to circular shift it to that row only.
                if (horizontal_pos1 > 4)
                    horizontal_pos1 -= 5;
                if (horizontal_pos2 > 4)
                    horizontal_pos2 -= 5;
                encryptedString += matrix.get(horizontal_pos1 + vertical_pos1);
                encryptedString += matrix.get(horizontal_pos2 + vertical_pos2);
            }
            // In normal cases...
            else {
                final_pos1 = (horizontal_pos2) + vertical_pos1;
                final_pos2 = (horizontal_pos1) + vertical_pos2;
                encryptedString += matrix.get(final_pos1);
                encryptedString += matrix.get(final_pos2);
            }
        }
        return encryptedString;
    }

    // A function which will convert the matrix in a ArrayList form, we will use
    // this structure as matrix using equation, as here we have fixed size of matrix
    // we dont really need to create a 2D structure to perform that.
    public static ArrayList<Character> generateMatrix(String key) {
        ArrayList<Character> matrix = new ArrayList<Character>();
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
        return matrix;
    }
}