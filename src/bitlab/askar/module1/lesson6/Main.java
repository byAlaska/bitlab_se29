package bitlab.askar.module1.lesson6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int [][]nums = new int[n][n];

        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums[i].length;j++){
                nums[i][j] = in.nextInt();
            }
        }

        for (int i=0;i<n/2;i++){
            //i=1
            int []array = nums[i];

            if (n%2==1){
                nums[i] = nums[i+n/2+1];
                nums[i+n/2+1] = array;
            }else {
                nums[i] = nums[i+n/2];
                nums[i+n/2] = array;
            }
        }


        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(nums[i][j] + ", ");
            }
            System.out.println();
        }

    }
}
