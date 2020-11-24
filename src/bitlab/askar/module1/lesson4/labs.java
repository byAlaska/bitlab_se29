package bitlab.askar.module1.lesson4;

import java.util.Scanner;

public class labs {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);


        int n = in.nextInt();
        int []array = new int[n];

        for (int i=0;i<array.length;i++){
            array[i] = in.nextInt();
        }

        int m = in.nextInt();

        double sum = 0;
        int cnt = 0;

        for (int i=0;i<array.length;i++){
            if (array[i]>m){
                sum += array[i];
                cnt++;
            }
        }

        System.out.println(sum/cnt);

    }
}
