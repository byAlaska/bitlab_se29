package bitlab.askar.module2.lesson7;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        try {
            Socket socket = new Socket("127.0.0.1",2077);
            ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            while(true){
                outStream.writeObject(in.next());
                String message = (String)inputStream.readObject();
                System.out.println(message);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
