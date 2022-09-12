//Using Objects as Parameters
class Tiger{
    String name;
    int age;

    public String getName() {
        if (this.name == null){
            return "You did not provide a name";
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Tiger(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Tiger(){
        this.name = null;
        this.age = -1;
    }

    Tiger(Tiger object){ //Copying object attributes
        this.name = object.name;
        this.age = object.age;
    }
    void talk(){
        System.out.println("Hi I am " + this.name + " and I am " + this.age);
    }


}

//Returning Objects

class Number{
    int number;
    Number(int giveMeANumber){
        this.number = giveMeANumber;

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    Number square(){
        Number temporaryObject = new Number(this.number * this.number);
        return temporaryObject;
    }



}

public class Main {
    public static void main(String[] args) {
    Tiger tiger1 = new Tiger("Larry",43);
    System.out.println(tiger1.getName());
    tiger1.talk();

    Tiger tiger2 = new Tiger(tiger1); //passing object as parameters
    tiger2.talk();

    Number num1 = new Number(5);
    System.out.println(num1.getNumber());
    Number num2 = num1.square();
    System.out.println(num2.getNumber());
    num2 = num2.square();
    System.out.println(num2.getNumber());

    }
}
