public class Dog {

    String race;
    int amountOfLegs;
    boolean hasTail;
    boolean isAlive;

    public Dog(String race, int amountOfLegs, boolean hasTail, boolean isAlive) {
        this.race = race;
        this.amountOfLegs = amountOfLegs;
        this.hasTail = hasTail;
        this.isAlive = isAlive;

    }

    public Dog(String race, int amountOfLegs, boolean hasTail) {
        this.race = race;
        this.amountOfLegs = amountOfLegs;
        this.hasTail = hasTail;
    }

    public Dog(boolean isAlive) {
        this.isAlive = isAlive;
    }
    
    public boolean isItAlive() {
        return this.isAlive;
    }

    //Ny metod, sätter om hunden är levande eller död
    public void setIsAlive(boolean alive) {
        this.isAlive = alive;
    }
 
}

