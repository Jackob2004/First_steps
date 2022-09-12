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

     void displayBasicInfromation(){
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

 class Car extends Vehicle{ // Car class (subclass) inherits the attributes and methods from the Vehicle class
    String vehicleType = "Car";
     int numberOfWheels;

     Car(String name,int speed,String vehicleType, int numberOfWheels){
         this.name = name;
         this.speed = speed;
         this.vehicleType = vehicleType;
         this.numberOfWheels = numberOfWheels;
     }

     void displayAdvencedInformation(){
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



public class M {
    public static void main(String[] args) {

        Car fred2 = new Car("Ford", 44,"Car", 4);
        fred2.displayBasicInfromation();
        fred2.displayAdvencedInformation();


    }
}
