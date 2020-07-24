/**
 * Temp
 */
public class BitManipMain {

    public static void main(String[] args) {
        display(15);
        remove(15,2);
    }

    public static void display(int set) {
        for (int i = 0; i < 10; i++) {
            if (set != 0 && ((set & (1 << i)) != 0)) {
                System.out.println(i + 1);
            }
        }
    }
    public static void remove(int set,int subset){
        System.out.println(set ^ (1<<(subset-1)));
    }
}
