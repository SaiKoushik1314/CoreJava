import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class GreetingServer extends Thread
 {
public static void main(String [] args)
{
 int port= Integer.parseInt(args[0]); //port number from command line to string
  try
    {
     Thread t = new GreetingServer(port); //new up object below with port number in a thread
     t.start(); //make thread elgible to be run
    }catch(IOException e)
      {
       e.printStackTrace();
      }
   }

//run below is started by t.start*********************************

 private ServerSocket serverSocket;

 public GreetingServer(int port) throws IOException
 {
   serverSocket = new ServerSocket(port);  //port number is sent in on start up
   serverSocket.setSoTimeout(60000);    //server will stay active for 60 seconds
 }
public void run()
 {
  String flag="N";
  while(flag.equals("N"))  //flag will be turned on when server socket times out
  {
   try
   {
   System.out.println("\nSERVER IS WAITING/LISTENING FOR CLIENT ON PORT  " +
   serverSocket.getLocalPort() + "...");
   Socket conversation_Socket  = serverSocket.accept();
                            //wait here till we have a listener
                           // will receive pointer to a NEW socket object
                           //that resides on server

    System.out.println("\n*** Connection has been made to client. Client is at this IP:PORT and   "
    + conversation_Socket.getRemoteSocketAddress());

    //set up io streams to talk to the client using info in the client socket we just obtained

    InputStreamReader in = new InputStreamReader(conversation_Socket.getInputStream());
    BufferedReader bufReader = new BufferedReader(in);
    PrintWriter out = new PrintWriter(conversation_Socket.getOutputStream(),true);
String inline = bufReader.readLine(); //we WAIT here till a line of text arrives

    //send message to console of server showing what was just read in from client
    System.out.println("\nSERVER RECEIVED 1ST MESSAGE FROM CLIENT--> "+ inline);


//writes one line to the buffer in socket..and sends it-do not use carriage control
   out.println("  SERVER WRITING THIS 1ST MESSAGE TO THE CLIENT  ***");
   out.flush();
//write a second message to client in buffer and send it
//   out.println("..SERVER 2ND MESSAGE: Thank you for connecting to this server at  " + conversation_Socket.getLocalSocketAddress() + "--Go$
   out.flush();

   inline= bufReader.readLine(); //wait till we receive one more line from client
   System.out.println("\n 2ND MESSAGE RECEIVED FROM FROM CLIENT -->    "+inline);

   conversation_Socket.close();
}catch(SocketTimeoutException s)
   {
     System.out.println("SERVER SOCKET HAS TIMED OUT --- END OF SESSION!!!");

     flag="Y";  //this is what gets us out of loop
   }catch(IOException e)
     {
     e.printStackTrace();
     break;
   }
 } //endwhile
} //end run
}