import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Lotto {
    public static void main(String[] args) throws IOException {
        System.out.println("Wpisz 4 liczby w zakresie od 0-4 aby rozpoczac losowanie ");
        System.out.println();
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int num4 = in.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 4; i++){
            numbers.add(i);
        }
        int[] a = new int[4];
        for (int count = 0; count < a.length; count++){
            a[count] = numbers.remove((int)(Math.random() * numbers.size()));
        }
        System.out.print("Szczensliwe liczby to : ");
        for (int i : a) {
            System.out.print(i + ",");
        }
        System.out.println();

        if ((num==a[0]||num==a[1]||num==a[2]||num==a[3])&&(num2==a[0]||num2==a[1]||num2==a[2]||num2==a[3])&&(num3==a[0]||num3==a[1]||num3==a[2]||num3==a[3])&&(num4==a[0]||num4==a[1]||num4==a[2]||num4==a[3])){
            System.out.println("Wygrales");
        }else {
            System.out.println("Przegrales");
        }










    }
}
