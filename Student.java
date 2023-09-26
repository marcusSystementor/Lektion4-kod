public class Student {
   
   //Instansvariabler längst upp.
    String firstName;
    String lastName;
    int birthYear;

    // Sedan kommer konstruktorn
    // Konstruktor med tre parametrar
    public Student(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    // Default konstruktor
    public Student() {

    }
    // Konstruktor med en parameter
    public Student(int birthYear) {
        this.birthYear = birthYear;
    }

    // Metod för att räkna ut ålder, returnerar en int.
    public int getAge (int currentYear) {
        return currentYear - this.birthYear;
    }
 }
