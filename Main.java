import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.interfaces.Messenger;
import company.implementations.EmailMessenger;
import company.utils.MathUtils;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Michał", 22);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age: " + e.getMessage());
        }
        
        //Lubie korzystać z klasy scanner i swierdziłem że świetnie się tutaj sprawdzi.
        Scanner wczytaj= new Scanner(System.in);
        int a,b,suma;
        System.out.print("podaj a:");
        a = wczytaj.nextInt();
        System.out.print("podaj b:");
        b =wczytaj.nextInt();
        suma = MathUtils.add(a, b);
        wczytaj.close();
        System.out.println("Suma "+a+"+"+b+"="+suma);

        Messenger emailMessenger = new EmailMessenger();

        emailMessenger.sendMessage("Suma "+a+"+"+b+"="+suma);
    }
}