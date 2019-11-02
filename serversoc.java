import java.io.BufferedReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStreamReader;

class serversoc
{
    public static void main(String[] args) throws Exception
     {
        ServerSocket ss=new ServerSocket(10011);
        Socket s= ss.accept();
        System.out.println("Hey you're connected!!");
    }
}