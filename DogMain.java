import java.util.ArrayList;
import java.util.Scanner;

public class DogMain {
    

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

       Dog dog1 = new Dog("Whippet", 4, true, true);

       Dog dog2 = new Dog("Bulldog", 3, true, false);

       boolean dogIsAlive = scanner.nextBoolean();
       
       Dog dog3 = new Dog(dogIsAlive);

       System.out.println(dog3.isAlive);

        ArrayList<Dog> dogList = new ArrayList<>();



        dogList.add(dog1);
        dogList.add(dog2);

        for (int i = 0; i < dogList.size(); i++) {
            System.out.println(dogList.get(i).race);
        }

        if (dog2.isAlive) {
            System.out.println("Buy");
        }
        else {
            System.out.println("Dont buy");
        }


     

    }
}
