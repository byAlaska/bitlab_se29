package bitlab.askar.module1.lesson2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String first = in.nextLine();

        String second;
        if (first.equals("science")){

            second = in.next();

            if (second.equals("Math")){
                System.out.println("You are Financier");
            }else if (second.equals("Physics")){
                System.out.println("You are Engineer");
            }

        }else if(first.equals("Humanitarian subjects")){

            second = in.next();

            if (second.equals("History")){
                System.out.println("You are Historic or Diplomat  ");
            }else {
                System.out.println("You are Translator");
            }
        }

    }
}
