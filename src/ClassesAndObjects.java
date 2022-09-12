public class ClassesAndObjects {
    public static void main(String[] args) {
        //static = for whole class not for single object
        class Human{

            //Method
            void talk(String name, int age){
                System.out.println("I am " + name + " and I am " + age);
            }

            int calculate(int one, int two, int three){
              return  one * two * three;
            }
        }

        //Object of Human class
        Human human1 = new Human();
        human1.talk("Larry", 43);
        int product = human1.calculate(3,4,1);
        System.out.println(product);

        Human human2 = new Human();
        human2.talk("Jane", 32);
        int product2 = human2.calculate(5,5,5);
        System.out.println(product2);


        class Dog{
            int age;
            String name;
            String breed;
        }

        Dog dog1 = new Dog();
        dog1.age = 5;
        dog1.name = "Hot";
        dog1.breed = "shitzu";
        System.out.println(dog1.name);
        System.out.println(dog1.breed);

        //Constructors peace of code that's run every time you make a new object / Parameterized Constructors

        class Zebra{
            String name;
            int age;

            //getters and setters

            public String getName(){
                return name;
            }

            public void setName(String name){
                this.name = name;
            }

            public int getAge(){
                return age;
            }

            public void setAge(int age){
                this.age = age;
            }


            //Constructor

            Zebra(String name, int age){  //you can use same names for parameters as fields in class when using parametrized constructor ("this" keyword)
                System.out.println("making a new zebra");
                this.name = name;
                this.age = age;
                talk();
            }

            void talk(){
                System.out.println("Zebra noises hi my name is " + name + " and i am " + age);
            }

            void ageup(){
                age++;
            }

        }

        Zebra zebra1 = new Zebra("Jose", 45);
        Zebra zebra2 = new Zebra("Jossepi", 5);
        Zebra zebra3 = new Zebra("Jerry", 4);
        System.out.println(zebra3.name); //instead of this you can use getter
        System.out.println(zebra3.getName());
        zebra3.setName("James");
        System.out.println(zebra3.getName());


        class BankAccount{
            private String accountNumber;
            long balance;
            String username;
            String address;
            int age;

            public String getAccountNumber() {
                return accountNumber;
            }

            public void setAccountNumber(String accountNumber) {
                this.accountNumber = accountNumber;
            }

            public long getBalance() {
                return balance;
            }

            public void setBalance(long balance) {
                this.balance = balance;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public String getAdress() {
                return address;
            }

            public void setAdress(String adress) {
                this.address = adress;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public void addMoney(long ammount){
                balance = balance + ammount;

            }
            public void deductMoney(long ammount){
                balance = balance - ammount;

            }


            public BankAccount(String accountNumber, long balance, String username, String adress, int age) {
                this.accountNumber = accountNumber;
                this.balance = balance;
                this.username = username;
                this.address = adress;
                this.age = age;
            }
        }

        BankAccount larryAccount = new BankAccount("252342342",1000000,"Larry","LA", 41);
        System.out.println(larryAccount.getAccountNumber());
        larryAccount.setAccountNumber("44");
        larryAccount.addMoney(300);
        System.out.println(larryAccount.getBalance());

        //Overloading Methods

        class Bb{
            //You overload method by using the same name and giving different parameters or data type
            //You can do the same with constructors (overloaded) constructors = methods

            void findSum(){
                System.out.println("You did not give any numbers");
            }
            int findSum(int a, int b){
                int sum = a + b;
                return sum;
            }

            int findSum(int a,int b, int c){
                int sum = a + b + c;
                return sum;
            }

        }

        Bb test = new Bb();
        System.out.println(test.findSum(3,1));
        System.out.println(test.findSum(3,5,1));
        test.findSum();


    }
}
