package Ejercicio1;

public class OperacionesVarias {
    public static boolean esPerfecto(int number){
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        return sum == number;
    }

    public static boolean esAbundante(int number){
        int sum = 0;

        for(int i = 1; i < number; i++){
            if (number % i == 0){
                sum += i;
            }
        }
        return sum > number;
    }

    public static boolean esDefectuoso(int number){
        int sum = 0;

        for (int i = 1; i < number; i++){
            if(number % i == 0){
                sum += i;
            }
        }
        return sum < number;
    }

    public static boolean esOdioso(int number){
        String binary = Integer.toBinaryString(number);
        int count = 0;

        for(int i = 0; i < binary.length(); i++){
            if (binary.charAt(i) == '1'){
                count++;
            }
        }
        return number % 2 == 1;
    }

    public static boolean esPrimo(int number){
        if (number <= 1){
            return false;
        }

        for (int i = 2; i < number; i++) {
            if(number % i == 0){
                return false;
            }
        }

        return true;
    }

    public static boolean esAmigo(int A, int B){
        int sumA = 0;
        int sumB = 0;
        for (int i = 1; i < A; i++) {
            if (A % i == 0) {
                sumA = sumA + i;
            }
        }
        for (int i = 1; i < B; i++){
            if (B % i == 0){
                sumB = sumB + i;
            }
        }
        return sumB == A && sumA == B;
    }

    public static boolean esEnemigo(int A, int B){
        return !esAmigo(A, B);
    }

    public static void dibujarPiramide() {
        int row = 10;
        for (int i = 0; i < row; i++) {
            for (int j = row - i - 1; j >= 1 ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
