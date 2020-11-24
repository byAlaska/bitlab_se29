package bitlab.askar.module1.lesson6;

import java.util.Scanner;

public class lab {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int [][]nums = new int[n][m];

        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums[i].length;j++){
                nums[i][j] = in.nextInt();

            }
        }

//
//
//        for (int i=0;i<nums.length;i++){
//            for (int j=0;j<nums[i].length;j++){
//                if (i==j || i+j==n-1){
//                    System.out.print("x ");
//                }else {
//                    System.out.print(nums[i][j] + " ");
//                }
//            }
//
//            System.out.println();
//        }

//
//        for (int i=0;i<m;i++){
//
//            int min = nums[0][0];
//            int minIndex = 0;
//            int max = nums[0][0];
//            int maxIndex = 0;
//
//            for (int j=0;j<n;j++) {
//
//                if (min < nums[j][i]){
//                    min = nums[j][i];
//                    minIndex = j;
//                }
//                if (max> nums[j][i]){
//                    max = nums[j][i];
//                    maxIndex = j;
//                }
//            }
//
//            nums[minIndex][i] = max;
//            nums[maxIndex][i] = min;
//
//            System.out.println();
//        }



//        int k = in.nextInt();
//
//        for (int i=0;i<m;i++){
//
//            int cnt = 0;
//            for (int j=0;j<n;j++){
//                if (nums[j][i]<0 && cnt<k){
//                    System.out.print(nums[j][i] + " ");
//                    cnt++;
//                }
//            }
//
//            for (int p=0;p<k-cnt;p++){
//                System.out.print("x ");
//            }
//
//            System.out.println();
//        }



        }
}
