import java.util.ArrayList;
import java.util.Scanner;

public class DogMain {
    

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

       Dog dog1 = new Dog("Whippet", 4, true, true);

       Dog dog2 = new Dog("Bulldog", 3, true, false);

       // Ber användaren mata in ifall hunden ska vara levande eller ej.
       boolean dogIsAlive = scanner.nextBoolean();
       
       // Skapar ett hundobjekt och matar in boolean-vrödet i dog3s konstuktor.
       Dog dog3 = new Dog(dogIsAlive);

       System.out.println(dog3.isAlive);


       // Skapar en ArrayList av Dog
        ArrayList<Dog> dogList = new ArrayList<>();


         // Lägger till de objekt vi skapat av Dog.   
        dogList.add(dog1);
        dogList.add(dog2);

        // Printar ut race för varje hund i array:en
        for (int i = 0; i < dogList.size(); i++) {
            System.out.println(dogList.get(i).race);
        }

        // IF-sats för att kolla hurvida hunden lever eller inte, om true köp hunden.
        if (dog2.isAlive) {
            System.out.println("Buy");
        }
        else {
            System.out.println("Dont buy");
        }

        // NYTT EXEMPEL
        // Ett annat sätt att sätta om en hund är levande eller inte.
        //Skapar en ny Dog utan isAlive i konstruktorn, vi sätter den parameter efteråt.
        Dog dog4 = new Dog("Tax", 4, true);

        boolean dogIsAliveNyttExempel = scanner.nextBoolean();
        // Skapade en ny metod under Dog.
        dog4.setIsAlive(dogIsAliveNyttExempel);

        System.out.println("Is the dog alive? " +dog4.isAlive);
     

    }
}
