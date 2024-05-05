import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.interfaces.Messenger;
import company.implementations.EmailMessenger;
import company.utils.MathUtils;


public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        final int b = 10;
        Messenger emailMessenger = new EmailMessenger();
        try {
            people[0] = new Person("John Doe", 30);
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age: " + e.getMessage());
        }
        try {
            people[1] = new Person("John Xoe", 20);
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age: " + e.getMessage());
        }
        try {
            people[2] = new Person("John Aoe", 10);
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age: " + e.getMessage());
        }
        try {
            people[3] = new Person("John Soe", 40);
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age: " + e.getMessage());
        }
        try {
            people[4] = new Person("John Boe", 60);
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age: " + e.getMessage());
        }
        
        //Chyba jednak scanner nie byl tak dobry jak myslałem
        for (Person person : people) {
            if (person != null) {
            int a = person.getAge();
            int suma = MathUtils.add(a, b);
            emailMessenger.sendMessage("Suma dla "+person.getName()+"="+suma);
            }
        }
    }
}