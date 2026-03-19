package Ejercicio2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert a text: ");
        String texto = sc.nextLine();

        System.out.print("Insert the word to search: ");
        String buscar = sc.nextLine();

        int resultado = OperacionesString.repeat(texto, buscar);
        System.out.println("The word appears " + resultado + " times");
    }
}
