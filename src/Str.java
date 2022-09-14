// Static & Final keywords
// static Attributes and methods belongs to the class, rather than an object

class StaticExample{
    final int example = 44; // final Attributes and methods cannot be overridden/modified (it's constant)
    static int a = 3; // you can access it outside the objects with the class
    static int b;

    static{
        System.out.println("Static block initialized"); // it runs whenever you call a new object or this class block
        b = a + 4;
    }

    static void cMethod(int x){
        System.out.println(a + " " + b + " " + x);
    }

}


public class Str {
    public static void main(String[] args) {
        StaticExample.cMethod(4);
        System.out.println(StaticExample.b);

    }

}
