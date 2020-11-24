package bitlab.askar.module1.lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        String string = in.next();


        boolean b = true;
        for (int i =0;i<string.length()/2;i++){
            if (string.charAt(i) != string.charAt(string.length() - i - 1)){
                b = false;
                break;
            }
        }

        if (b){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
