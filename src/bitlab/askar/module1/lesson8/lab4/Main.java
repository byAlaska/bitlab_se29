package bitlab.askar.module1.lesson8.lab4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);


        User user1 =  new User(1,"User","qwe","admin");
        User user2 =  new User(2,"olzhas","rty","client");
        User user3 =  new User(3,"manager","qwe","manager");
        User user4 =  new User(4,"user2","123","admin");
        User user5 =  new User(5,"kafka","password","admin");


        User[] users = {user1,user2,user3,user4,user5};




        System.out.println("INSERT LOGIN:");
        String login = in.next();
        System.out.println("INSERT PASSWORD");
        String password = in.next();


        User user = null;

        for (int i=0;i<users.length;i++){
            if (users[i].getLogin().equals(login) && users[i].getPassword().equals(password)){
                user = users[i];
            }
        }

        System.out.println("Welcome  " + user.getLogin());

        while (true){
            System.out.println("PRESS [1] TO EDIT LOGIN");
            System.out.println("PRESS [2] TO CHANGE PASSWORD");
            System.out.println("PRESS [3] TO LIST USERS\n"+"PRESS [0] TO EXIT");

            int choice  = in.nextInt();

            if (choice==1){
                System.out.println("INPUT NEW LOGIN");
                String newLogin = in.next();
                user.setLogin(newLogin);
            }else if (choice==2){

                System.out.println("INPUT OLD PASSWORD");
                String oldPassword = in.next();

                if (user.getPassword().equals(oldPassword)){
                    System.out.println("NEW PASSWORD");
                    String newPassword = in.next();
                    System.out.println("Re-Insert new password");
                    if (newPassword.equals(in.next())){
                        user.setPassword(newPassword);
                    }
                }

            }else if (choice==3){
                for (int i=0;i<users.length;i++){
                    System.out.println(users[i].toString());
                }
            }else {
                break;
            }


        }

    }
}
