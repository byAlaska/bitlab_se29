package bitlab.askar.module2.lesson4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args){

        User user = new User(1,"asdg","asdg");
        User user2 = new User(2,"qwe","asdqweg");
        User user3 = new User(3,"dgssdh","sdfhsdfk");

        ArrayList<User> users = new ArrayList<>();

        users.add(user);
        users.add(user2);
        users.add(user3);

        write(users);
        System.out.println(read().toString());
    }


    public static void write(ArrayList<User> users){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("input.txt"));
            for (User u:users){
                writer.write(u.id + "\n");
                writer.write(u.login + "\n");
                writer.write(u.password + "\n");
            }
            writer.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static ArrayList<User> read(){

        ArrayList<User> result  = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));

            String id;
            User user = null;

            while ( (id= reader.readLine()) != null){
                int id2 = Integer.parseInt(id);
                String login = reader.readLine();
                String password  = reader.readLine();

                user = new User(id2,login,password);
                result.add(user);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return result;
    }
}
