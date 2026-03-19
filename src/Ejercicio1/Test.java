package Ejercicio1;

import java.util.Scanner;


public class Test {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("===SELECT ONE OPTION===");
        System.out.println("1. Es perfecto");
        System.out.println("2. Es abundante");
        System.out.println("3. Es defectuoso");
        System.out.println("4. Es odioso");
        System.out.println("5. Es primo");
        System.out.println("6. Es amigo");
        System.out.println("7. Es enemigo");
        System.out.println("8. Dibujar Piramide");

        int option = scanner.nextInt();

        switch (option){
            case 1:
                System.out.print("Insert a number you want: ");
                int number = scanner.nextInt();
                System.out.println("Result: " + OperacionesVarias.esPerfecto(number));
                break;
            case 2:

                System.out.print("Insert a number you want: ");
                int abundant = scanner.nextInt();
                System.out.println("Result: " + OperacionesVarias.esAbundante(abundant));
                break;
            case 3:

                System.out.print("Insert a number you want: ");
                int defectuoso = scanner.nextInt();
                System.out.println("Result: " + OperacionesVarias.esDefectuoso(defectuoso));
                break;
            case 4:

                System.out.print("Insert a number you want: ");
                int odioso = scanner.nextInt();
                System.out.println("Result: " + OperacionesVarias.esOdioso(odioso));
                break;
            case 5:

                System.out.print("Insert a number you want: ");
                int primo = scanner.nextInt();
                OperacionesVarias.esPrimo(primo);
                break;
            case 6:
                System.out.print("Insert two numbers: ");
                int amigo = scanner.nextInt();
                int amigo1 = scanner.nextInt();
                OperacionesVarias.esAmigo(amigo, amigo1);
                break;
            case 7:
                System.out.print("Insert two numbers: ");
                int enemigo = scanner.nextInt();
                int enemigo1 = scanner.nextInt();
                OperacionesVarias.esEnemigo(enemigo, enemigo1);
                break;
            case 8:
                OperacionesVarias.dibujarPiramide();
                break;
        }
    }
}
