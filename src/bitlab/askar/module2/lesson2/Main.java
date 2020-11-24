package bitlab.askar.module2.lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int []array = new int[5];
        for (int i=0;i<5;i++){
            array[i] = in.nextInt();
        }


        for (int i=0;i<5;i++){
            System.out.println(array[i]);
        }
    }
}
