import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.interfaces.Messenger;
import company.implementations.EmailMessenger;


public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Michał", 22);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age: " + e.getMessage());
        }
        Messenger emailMessenger = new EmailMessenger();

        emailMessenger.sendMessage("przykładowa wiadmość");
    }
}
