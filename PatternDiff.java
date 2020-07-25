public class PatternDiff {
    public static void main(String[] args) {
        
        for (int i = 0; i < 15; i++) {
            System.out.print("*");
            for (int j = 1; j < 14; j++) {
                if(j==i||j==14-i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}