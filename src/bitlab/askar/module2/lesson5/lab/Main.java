package bitlab.askar.module2.lesson5.lab;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Game game = new Game();
        Scanner in = new Scanner(System.in);


        while (true){
            System.out.println("[1] create game");
            System.out.println("[2] add player");
            System.out.println("[3] play game");
            System.out.println("[0] exit");

            int choice = in.nextInt();
            if (choice==1){
                System.out.println("Game name:\n" +
                        "IP address:\n" +
                        "PORT:");

                String name = in.next();
                String ipAddress = in.next();
                int port = in.nextInt();

                game = new Game(name,ipAddress,port);
                saveGame(game);
            }else if (choice==2){
                System.out.println(" Nickname:\n" + "Rating:");
                String nickName=  in.next();
                double rating = in.nextDouble();

                Player player = new Player(nickName,rating);
                game.addPlayers(player);
                saveGame(game);
            }else if (choice==3){
                System.out.println(game.toString());
            }else {
                break;
            }
        }
    }

    static void saveGame(Game game){
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("input.txt"));
            outputStream.writeObject(game);
            outputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
