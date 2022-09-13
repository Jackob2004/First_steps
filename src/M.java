//Inheritance

 class Vehicle{ //super class
    String name;
    int speed;

     public Vehicle(String name, int speed) {
         this.name = name;
         this.speed = speed;
     }

     Vehicle(){
         this.name = "Unknown";
         this.speed = 0;
     }

     void displayBasicInformation(){
         System.out.println("Vehicle name " + name + " Vehicle speed " + speed);
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getSpeed() {
         return speed;
     }

     public void setSpeed(int speed) {
         this.speed = speed;
     }
 }

 class Car extends Vehicle{ //  Car class (subclass) inherits the attributes and methods from the Vehicle class
    String vehicleType = "Car";
     int numberOfWheels;

     Car(String name,int speed,String vehicleType, int numberOfWheels){
         this.name = name;
         this.speed = speed;
         this.vehicleType = vehicleType;
         this.numberOfWheels = numberOfWheels;
     }

     void displayAdvancedInformation(){
         System.out.println("Vehicle name " + name + " Vehicle speed " + speed + " Vehicle type " + vehicleType + " Number of wheels " + numberOfWheels);
     }

     public String getVehicleType() {
         return vehicleType;
     }

     public void setVehicleType(String vehicleType) {
         this.vehicleType = vehicleType;
     }

     public int getNumberOfWheels() {
         return numberOfWheels;
     }

     public void setNumberOfWheels(int numberOfWheels) {
         this.numberOfWheels = numberOfWheels;
     }



 }
 //superclass
 class Animal{
    String name = "bob";

     void display(){
         System.out.println("Animal name: " + name);
     }
     Animal(){
         System.out.println("Hi I am animal");
     }
     Animal(String name){
         System.out.println("Hi i am " + name);
     }

 }

 class Hog extends Animal{
    String name = "Hog";

    void display(){
        System.out.println("Animal name: " + name);
    }
    void fullDisplay(){
        super.display(); //super keyword

    }
    Hog(String name){
        super(name); // super keyword
        System.out.println("Hi I am Hog");
    }
 }



public class M {
    public static void main(String[] args) {

        Car fred2 = new Car("Ford", 44,"Car", 4);
        fred2.displayBasicInformation();
        fred2.displayAdvancedInformation();

        System.out.println();
        Hog hog1 = new Hog("marcus");
        hog1.fullDisplay();

    }
}
