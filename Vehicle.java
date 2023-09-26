public class Vehicle {
 
    //Instans variabler

    String type;
    String regNumber;
    int yearManufactured;
    String brand;
    String color;

    //konstruktor med 5 parametrar

    public Vehicle(String type, String regNumber, int yearManufactured, String brand, String color) {

        this.type = type;
        this.regNumber = regNumber;
        this.yearManufactured = yearManufactured;
        this.brand = brand;
        this.color = color;
    }

    // metod för att skriva ut att det brand man sätter kör.
    public void drive() {
        System.out.println(this.brand + " drives");
    }



}
