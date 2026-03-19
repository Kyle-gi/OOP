package Ejercicio2;

import java.util.Scanner;

public class OperacionesString {

    public static void iniciales(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce el apellido: ");
        String apellido = sc.nextLine();

        System.out.print("La primera letra de nombre y el apellido: " + nombre.charAt(0) + " " + apellido.charAt(0));
    }

    public static void conCat(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nombre: ");
        String letra = sc.nextLine();
        System.out.print("Introduce el apellido: ");
        String letra2 = sc.nextLine();

        String resultado = (letra + " " + letra2).toUpperCase();
        System.out.println(resultado);
    }

    public static void length(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un frase: ");
        String frase = sc.nextLine();

        String[] palabras = frase.split(" ");
        int numeroDePalabras = palabras.length;

        System.out.print("El numero de palabras es: " + numeroDePalabras);
    }

    public static int repeat(String text, String search){
        int count = 0;
        int index = 0;

        while ((index = text.indexOf(search, index)) != -1){
            count++;
            index += search.length();
        }

        return count;
    }
}
