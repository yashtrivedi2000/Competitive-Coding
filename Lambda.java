/*
    Simple Implementation of Lambda Expression using Java. 
    I've used lambda expression to emplement threading here.
*/
public class Lambda {
    public static void main(String[] args) {
        //1. Directly using Thread Object and calling run method
        new Thread(() -> {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Thread Lambda: " + sum);
        }).start();

        //2. First implementing Runnable and then passing it to the Thread class.
        Runnable runn = () -> {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Runnable Lambda: " + sum);
        };
        new Thread(runn).start();
    }
}
