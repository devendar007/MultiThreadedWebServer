import java.net.*;
import java.io.*;
public class client  {
    public void run() throws UnknownHostException,IOException {
        int port =8080;   //i have to connect on the same port as of server
        InetAddress address=InetAddress.getByName("localhost");  //this helps me to get the ip address of the server
        Socket socket=new Socket(address,port);  //socket is created to communicate with server having this address and port
        PrintWriter toServer=new PrintWriter(socket.getOutputStream(),true);
        BufferedReader fromSocket=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        toServer.println("hello from socket"+socket.getLocalSocketAddress());
        String text=fromSocket.readLine();
        System.out.println(text);
        toServer.close();
        fromSocket.close();
        socket.close();


    }
    public static void main(String[] args) {
    client c1=new client();
    try {
        c1.run();
    } catch (Exception e) {
        // TODO: handle exception
        e.printStackTrace();
    }
        
    }
}
