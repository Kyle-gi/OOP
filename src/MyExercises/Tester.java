package MyExercises;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Insert your name: ");
        String name = sc.nextLine();
        System.out.print("Inser the age: ");
        int age = sc.nextInt();


        Person pr = new Person(name, age);
        System.out.println(pr.toString());
    }
}
