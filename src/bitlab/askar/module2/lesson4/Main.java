package bitlab.askar.module2.lesson4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args){

        ArrayList<String> products = read();

        while (true) {
            System.out.println("[1] add product");
            System.out.println("[2] list products");
            System.out.println("[3] exit ");

            int choice = in.nextInt();

            if (choice == 1) {
                String product = in.next();
                products.add(product);
                write(products);
            } else if (choice == 2) {
                for (String s : products) {
                    System.out.println(s);
                }
            } else {
                break;
            }
        }
    }

    public static void write(ArrayList<String> products){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("input.txt"));
            for (String s:products){
                writer.write(s + "\n");
            }
            writer.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static ArrayList<String> read(){

        ArrayList<String> result  = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));

            String s;
            while ( (s= reader.readLine()) != null){
                result.add(s);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return result;
    }
}
