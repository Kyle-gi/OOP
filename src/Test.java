import java.util.Scanner;


public class Test {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("===SELECT ONE OPTION===");
        int option = 0;

        switch (option){
            case 1:
                int number = 0;
                System.out.print("Insert a number you want: ");
                scanner.nextInt();
                OperacionesVarias.esPerfecto(number);
            case 2:
                int abundant = 0;
                System.out.print("Insert a number you want: ");
                scanner.nextInt();
                OperacionesVarias.esAbundante(abundant);
            case 3:
                int defectuoso = 0;
                System.out.print("Insert a number you want: ");
                scanner.nextInt();
                OperacionesVarias.esDefectuoso(defectuoso);
            case 4:
                int odioso = 0;
                System.out.print("Insert a number you want: ");
                scanner.nextInt();
                OperacionesVarias.esOdioso(odioso);
            case 5:
                int primo = 0;
                System.out.print("Insert a number you want: ");
                scanner.nextInt();
                OperacionesVarias.esPrimo(primo);
            case 6:
                int amigo = 0;
                int amigo1 = 0;
                System.out.print("Insert two numbers: ");
                scanner.nextInt();
                OperacionesVarias.esAmigo(amigo, amigo1);
            case 7:
                int enemigo = 0;
                int enemigo1 = 0;
                System.out.print("Insert two numbers: ");
                scanner.nextInt();
                OperacionesVarias.esEnemigo(enemigo, enemigo1);
            case 8:
                OperacionesVarias.dibujarPiramide();
        }
    }
}
