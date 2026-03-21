package Ejercicio3;

import java.util.Arrays;
import java.util.Scanner;

public class OperacionesArray {

    static int[] insert;

    public static void loadArray(){
        Scanner sc = new Scanner(System.in);
        insert = new int[5];

        for(int i = 0; i < insert.length; i++){
            System.out.print("Insert five numbers: ");
            insert[i] = sc.nextInt();
        }
    }


    public static void listArray(){
        if(insert == null){
            System.out.println("Array not loaded yet!");
            return;
        }

        System.out.println("Your inserted number is: ");
        for (int i = 0; i < insert.length; i++) {
            System.out.print(insert[i] + " ");
        }
        System.out.println();
    }

    public static void orderArray(){
        Arrays.sort(insert);
        System.out.print(Arrays.toString(insert));
    }
}
