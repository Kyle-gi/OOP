package Exam;

import java.util.Scanner;

public class Platform {
    public static final String[] PROVINCES = {"Barcelona", "Lugo", "Madrid", "Malaga", "Valencia", "Vizcaya"};
    private Content[][] contents;

    public Platform() {
        contents = new Content[6][6];
    }

    public Platform(int columns) {
        contents = new Content[6][columns];
    }

    public boolean hayHueco() {
        for (int i = 0; i < contents.length; i++) {
            for (int j = 0; j < contents[i].length; j++) {
                if (contents[i][j] == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public Movie crearPelicula() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter title: ");
        String title = sc.nextLine();

        System.out.print("Enter base price: ");
        double basePrice = sc.nextDouble();

        System.out.print("Enter release year: ");
        int releaseYear = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter age rating (PEGI 3,7,12,16,18): ");
        String ageRating = sc.nextLine();

        System.out.print("Enter street: ");
        String street = sc.nextLine();

        System.out.print("Enter province: ");
        String province = sc.nextLine();

        Address address = new Address(street, province);

        System.out.print("Enter duration in minutes: ");
        int duration = sc.nextInt();

        System.out.print("Is it a new release (true/false): ");
        boolean isNewRelease = sc.nextBoolean();
        sc.nextLine();

        System.out.print("Enter genre: ");
        String genre = sc.nextLine();

        return new Movie(id, title, basePrice, releaseYear, ageRating, address, duration, isNewRelease, genre);
    }

    public VideoGame crearVideojuego() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter title: ");
        String title = sc.nextLine();

        System.out.print("Enter base price: ");
        double basePrice = sc.nextDouble();

        System.out.print("Enter release year: ");
        int releaseYear = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter age rating (PEGI 3,7,12,16,18): ");
        String ageRating = sc.nextLine();

        System.out.print("Enter street: ");
        String street = sc.nextLine();

        System.out.print("Enter province: ");
        String province = sc.nextLine();

        Address address = new Address(street, province);

        System.out.print("Enter platform (PC, PS5, Xbox, Switch): ");
        String platform = sc.nextLine();

        System.out.print("Is it multiplayer? (true/false): ");
        boolean isMultiplayer = sc.nextBoolean();

        System.out.print("Enter size in GB: ");
        double sizeGB = sc.nextDouble();

        return new VideoGame(id, title, basePrice, releaseYear, ageRating, address, platform, isMultiplayer, sizeGB);
    }

    public void añadirContenido(Content c) {
        String province = c.getAddress().getProvince();

        int row = -1;
        for (int i = 0; i < PROVINCES.length; i++) {
            if (PROVINCES[i].equals(province)) {
                row = i;
                break;
            }
        }

        if (row == -1) {
            System.out.println("Province not valid!");
            return;
        }

        for (int j = 0; j < contents[row].length; j++) {
            if (contents[row][j] == null) {
                contents[row][j] = c;
                System.out.println("Content added successfully!");
                return;
            }
        }

        System.out.println("No space in " + province + " province!");
    }

    public void listarContenidos() {
        boolean empty = true;
        for (int i = 0; i < contents.length; i++) {
            System.out.println("\n--- " + PROVINCES[i] + " ---");
            for (int j = 0; j < contents[i].length; j++) {
                if (contents[i][j] != null) {
                    empty = false;
                    Content c = contents[i][j];
                    System.out.println("  [" + j + "] " + c.getTitle() + " (" + c.getClass().getSimpleName() + ")");
                }
            }
        }
        if (empty) {
            System.out.println("No content in platform!");
        }
    }
}