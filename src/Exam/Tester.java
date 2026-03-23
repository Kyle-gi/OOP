package Exam;
    import java.util.Scanner;

    public class Tester {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Platform platform = new Platform();
            int option;

            do {
                System.out.println("\n===== PLATFORM MENU =====");
                System.out.println("1. List all content");
                System.out.println("2. Add content (Movie or VideoGame)");
                System.out.println("0. Exit");
                System.out.print("Choose: ");
                option = sc.nextInt();

                switch (option) {
                    case 1:
                        platform.listarContenidos();
                        break;
                    case 2:
                        System.out.println("1. Add Movie");
                        System.out.println("2. Add VideoGame");
                        System.out.print("Choose type: ");
                        int type = sc.nextInt();
                        sc.nextLine();

                        if (type == 1) {
                            Movie m = platform.crearPelicula();
                            platform.añadirContenido(m);
                        } else if (type == 2) {
                            VideoGame v = platform.crearVideojuego();
                            platform.añadirContenido(v);
                        } else {
                            System.out.println("Invalid type");
                        }
                        break;
                    case 0:
                        System.out.println("Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid option");
                }
            } while (option != 0);

            sc.close();
        }
    }

