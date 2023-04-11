import java.io.*;
import java.net.*;
public class TCPClient
{
public static void main(String args[])throws IOException
{
    try{
    Socket s=new Socket("localhost",5555);
    BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
    String line;
    do{
        line=b.readLine();
        PrintWriter p=new PrintWriter(s.getOutputStream(),true);
        p.println(line);
    }
    while(!line.equals("exit"));
    s.close();
}
catch(Exception e){
    System.out.println("Cannot connect to Server");
}
    }
}