package Array;

import java.util.Scanner;

public class _2_jaggedArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of row : ");
        int arr[][] = new int[sc.nextInt()][];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number of elements in col " + i + " : ");
            arr[i] = new int[sc.nextInt()];
            System.out.println("Enter elements of col " + i + " :");
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Entered elements are :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
