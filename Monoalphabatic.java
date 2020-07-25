import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Monoalphabatic {
    public static void main(String[] args) {
        ArrayList<Character> mapping_list = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));
        ArrayList<Character> mapped_list = new ArrayList<>(Arrays.asList('d', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c'));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter plain text: ");
        String plain_text = sc.next();
        String cipher_text = encrypt(mapping_list, mapped_list, plain_text);
        System.out.println("Cipher text is: " + cipher_text);
        sc.close();
    }

    private static String encrypt(ArrayList<Character> mapping_list, ArrayList<Character> mapped_list,
            String plain_text) {
        String cipher_text = "";
        char ch;
        for (int i = 0; i < plain_text.length(); i++) {
            ch = plain_text.charAt(i);
            if (!mapping_list.contains(ch))
                cipher_text += "";
            else {
                cipher_text += mapped_list.get(mapping_list.indexOf(ch));
            }
        }
        return cipher_text;
    }
}