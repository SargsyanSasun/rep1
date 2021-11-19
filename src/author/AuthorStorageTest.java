package author;
import java.util.Scanner;
import java.util.InputMismatchException;

public class AuthorStorageTest {

    public static void main(String[] args) {
      AuthorStorage authorStorage = new AuthorStorage();
        Scanner myObj = new Scanner(System.in);
        System.out.println("Write number");

        int number = myObj.nextInt();

        Author index = null;
        for (int i = 0; i < number; i++) {
            String name = myObj.nextLine();
            System.out.println("Name:");
            String surName = myObj.nextLine();
            System.out.println("Surname:");
            String email = myObj.nextLine();
            System.out.println("Email:");
            Integer age = myObj.nextInt();
            System.out.println("Age:");
            String gender = myObj.nextLine();
            System.out.println("Gender:");
            Author author = new Author(name,surName,email,age,gender);
            authorStorage.add(author);
            author.toString();
            index =  authorStorage.getByIndex(number);
        }
    authorStorage.print();
    }
}
