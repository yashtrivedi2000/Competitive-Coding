import java.util.Scanner;

public class Cieser_Cipher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter text to decrypt: ");
        String plan_text=sc.next();
        System.out.println("Enter key: ");
        int key=sc.nextInt();
        String cipher_text=encrypt_text(plan_text, key);
        System.out.println("Cipher text is: "+cipher_text);
        System.out.println("Cipher text is: "+decrypt_text(cipher_text, key));
    }

    private static String decrypt_text(String cipher_text,int key){
        int ch;
        String plain_text="";
        for (int i = 0; i < cipher_text.length(); i++) {
            ch=cipher_text.charAt(i);
            if(ch>='A' && ch<='Z'){
              ch=(Math.abs(ch-65)%26)+65-key;
            }
            else if(ch>='a'&& ch<='z'){
                ch=(Math.abs(ch-97)%26)+97-key;
            }
            else {
                ch=0;
            }
            plain_text+=(char)ch;
        }
        return plain_text;
    }
    private static String encrypt_text(String plan_text, int key) {
        int ch;
        String cipher_text="";
        for (int i = 0; i < plan_text.length(); i++) {
            ch=plan_text.charAt(i);
            if(ch>='A' && ch<='Z'){
              ch=(((ch-65)+key)%26)+65;
            }
            else if(ch>='a'&& ch<='z'){
                ch=(((ch-97)+key)%26)+97;
            }
            else {
                ch=0;
            }
            cipher_text+=(char)ch;
        }
        return cipher_text;
    }
}