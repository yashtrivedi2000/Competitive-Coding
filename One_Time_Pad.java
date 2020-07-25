public class One_Time_Pad {
    public static void main(String[] args) {
        
    }

    public static String randomAlphaNumeric(int count) {
        StringBuilder builder = new StringBuilder();
        while (count-- != 0) {
            
            builder.append(Math.random());
        }
        return builder.toString();
    }
}