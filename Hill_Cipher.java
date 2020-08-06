import java.util.Scanner;

public class Hill_Cipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String plain_text = sc.nextLine();
        int[][] keyMatrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                keyMatrix[i][j] = sc.nextInt();
            }
        }
        int[][] messageVector = new int[3][1];
        for (int i = 0; i < 3; i++)
            messageVector[i][0] = (plain_text.charAt(i)) % 65;
        encryptMessage(keyMatrix, messageVector);
        sc.close();
    }

    private static void encryptMessage(int[][] keyMatrix, int[][] messageVector) {
        int[][] cipherMatrix = new int[3][1];
        int x, i, j;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 1; j++) {
                cipherMatrix[i][j] = 0;
                for (x = 0; x < 3; x++) {
                    cipherMatrix[i][j] += keyMatrix[i][x] * messageVector[x][j];
                }
                cipherMatrix[i][j] = cipherMatrix[i][j] % 26;
            }
        }
        String CipherText=""; 
    for (i = 0; i < 3; i++) 
        CipherText += (char)(cipherMatrix[i][0] + 65); 
    System.out.print(" Ciphertext:" + CipherText);
    }
}