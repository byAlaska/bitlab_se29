package bitlab.askar.module2.lesson8.practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        DBManager dbManager = DBManager.getDb();
        dbManager.connect();
        

        while (true) {
            System.out.println("RESS [1] TO ADD ITEMS\n" +
                    "PRESS [2] TO LIST ITEMS\n" +
                    "PRESS [3] TO DELETE ITEMS\n" +
                    "PRESS [0] TO EXIT");


            System.out.println("Insert new choice");

            System.out.println("Hello brother");


            System.out.println("ljahsdkgjlaskd");
            int choice = in.nextInt();

            if (choice == 1) {
                System.out.println("Insert name:");
                String name = in.next();
                System.out.println("Insert price");
                double price = in.nextDouble();
                Item item = new Item(null, name, price);
                dbManager.addItem(item);
            } else if (choice == 2) {
                System.out.println(dbManager.getAllItems().toString());
            } else if (choice == 3) {
                System.out.println("Insert ID:");
                int id = in.nextInt();
                dbManager.deleteItem(id);
            } else {
                break;
            }
        }
    }
}
