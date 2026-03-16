public class Exercise {
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
        int sum = 0;

        for (int i = 1; i < number; i++){
            if(number )
        }
    }

    public static boolean esPrimo(){

    }

    public static boolean esAmigo(){

    }

    public static boolean esEnemigo(){

    }

    public static void dibujarPiramide(){

    }
}
