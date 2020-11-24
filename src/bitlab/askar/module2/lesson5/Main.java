package bitlab.askar.module2.lesson5;

import bitlab.askar.module2.lesson4.User;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        User user = new User(1,"asdg","asdg");
        User user2 = new User(2,"qwe","asdqweg");
        User user3 = new User(3,"dgssdh","sdfhsdfk");

        ArrayList<User> users = new ArrayList<>();

        users.add(user);
        users.add(user2);
        users.add(user3);

        write(users);
        ArrayList<User> users1 = read();
        System.out.println(users1.toString());

    }

    public static void write(ArrayList<User> users){
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("users.txt"));
            outputStream.writeObject(users);
            outputStream.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static ArrayList<User> read(){
        ArrayList<User> users = new ArrayList<>();
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("users.txt"));
            users = (ArrayList<User>)inputStream.readObject();
            inputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        return users;
    }
}
