import java.io.*;
import java.net.*;
public class Server{
    public void run() throws IOException{   //here i have throw ioException because networking involves i/o operations and it can fail that is no client connect or networking issues
        int port =8080;   //it is like a door for my this server if you reached this door you can connect to my server
        ServerSocket socket=new ServerSocket(port); // here i have ServerSocket which listens for client requests and accpets it
        socket.setSoTimeout(20000);
       
        while(true){
             System.out.println("Server is running on port:"+port);
            Socket acceptedConnection=socket.accept();  /*here code flow will stuck here  until the client detects if client detects it will
                                                            return two things one is socket object (where client and server can communicates) and another is info about the client
                                                            like its ip and its port*/
            System.out.println("Client accepted:"+acceptedConnection.getRemoteSocketAddress()); //it will print the ip and port of the client
            PrintWriter toClient=new PrintWriter(acceptedConnection.getOutputStream(),true);  /* so here getOutputStream() retrieves outputstream which will help us to send data to client 
                                                                                          but here  is a catch that it deals with bytes and we can't write data in bytes so here our hero
                                                                                          printwriter comes into the game it convert the text into the bytes and send to outputstream     */
            BufferedReader fromClient=new BufferedReader(new InputStreamReader(acceptedConnection.getInputStream())); /* getinputStream retreives data form the inputstream in the form of bytes
                                                                                                                          and inputstreamreader converts those bytes into the text and with the  help
                                                                                                                          of bufferedreader we can read text line by line or character by character*/
            toClient.println("hello from devendar's server");
            // String clientText=fromClient.readLine();
        // System.out.println(clientText);
            toClient.close();
            fromClient.close();
            acceptedConnection.close();

        }


    }
    public static void main(String[]args){
        Server s1=new Server();
        try {
            s1.run();
        } catch (Exception e) {
            
            e.printStackTrace();
        }


    }
}
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.io.PrintWriter;
// import java.net.ServerSocket;
// import java.net.Socket;
// import java.net.UnknownHostException;

// public class Server {
    
//     public void run() throws IOException, UnknownHostException{
//         int port = 8010;
//         ServerSocket socket = new ServerSocket(port);
//         socket.setSoTimeout(20000);
//         while(true){
//             System.out.println("Server is listening on port: "+port);
//             Socket acceptedConnection = socket.accept();
//             System.out.println("Connected to "+acceptedConnection.getRemoteSocketAddress());
//             PrintWriter toClient = new PrintWriter(acceptedConnection.getOutputStream(), true);
//             BufferedReader fromClient = new BufferedReader(new InputStreamReader(acceptedConnection.getInputStream()));
//             toClient.println("Hello World from the server");
//         }
//     }

//     public static void main(String[] args){
//         Server server = new Server();
//         try{
//             server.run();
//         }catch(Exception ex){
//             ex.printStackTrace();
//         }
//     }

// }