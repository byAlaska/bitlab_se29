package bitlab.askar.module2.lesson7;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientHandler extends Thread {

    Socket socket;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        try {
            Scanner in = new Scanner(System.in);

            ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream());
            String message = "";
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());

            while((message = (String)inStream.readObject())!=null){
                System.out.println(message);
                outputStream.writeObject(in.next());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
