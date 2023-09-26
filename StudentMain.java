public class Main {

    public static void main(String[] args) {
        
        Student student1 = new Student("Student1","Test" , 1995);

        System.out.println(student1.firstName);

       int age = student1.getAge(2023);
       System.out.println(age);

    }
    public static int getAge(int birthYear ,int currentYear) {
        return currentYear - birthYear;
    }
}
