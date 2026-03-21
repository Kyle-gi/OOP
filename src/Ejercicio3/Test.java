package Ejercicio3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        int option = 0;


        do{
        System.out.println("====SELECT AN OPTION====");
        System.out.println("1. Load Array");
        System.out.println("2. List the array");
        System.out.println("3. Order the array");
        System.out.println();
        System.out.print("Insert your option: ");
        option = sc.nextInt();


        switch (option){
            case 1:
                OperacionesArray.loadArray();
                break;
            case 2:
                OperacionesArray.listArray();
                break;
        }
        } while (option != 0);
        sc.close();
    }
}
