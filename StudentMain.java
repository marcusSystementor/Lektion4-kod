public class Main {

    public static void main(String[] args) {

        // Skapar en ny instans av student
        Student student1 = new Student("Student1","Test" , 1995);

        // skriver ut student1 första namn.
        System.out.println(student1.firstName);

        // Skickar in födelseår i metod getAge() i student1
        // lagrar det vi får i return av getAge() i student 1 i int age.
        
       int age = student1.getAge(2023);
           // Skriver ut age.
        System.out.println(age);

    }
    // Samma metod som i Student men här i en statisk variant.
    // Dvs den tillhör klassen, inte objektet som vi skapade från ritningen Student.
    public static int getAge(int birthYear ,int currentYear) {
        return currentYear - birthYear;
    }
}
