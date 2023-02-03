import java.io.*;
import java.util.*;
import java.net.*;

public class Client {
    public static void main(String args[]) {
        try {
            Scanner s = new Scanner(System.in);
            Socket skt = new Socket("127.0.0.1", 139);
            DataInputStream din = new DataInputStream(skt.getInputStream());
            DataOutputStream dout = new DataOutputStream(skt.getOutputStream());
            System.out.print("Enter the logical address: ");
            String str1 = s.nextLine();
            dout.writeBytes(str1 + '\n');
            String str = din.readLine();
            System.out.println("Physical Address: " + str);
            skt.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
