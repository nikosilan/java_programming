
import java.util.Scanner;
public class SumOfThreeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ensimmäinen luku
        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());

        // toinen luku
        int second;
        System.out.println("Give the second number:");
        second = Integer.parseInt(scanner.nextLine());

        // kolmas luku
        int third;
        System.out.println("Give the third number:");
        third = Integer.parseInt(scanner.nextLine());

        // 3 luvun summa
        int sum = first + second + third;

        // Kerrotaan keskenään
        int product = first * second * third;

        // keskiarvo
        double average = sum / 3.0;


        System.out.println("The sum of the numbers is " + sum);
        System.out.println("The product of the numbers is " + product);
        System.out.println("The average of the numbers is " + average);

        
        scanner.close();
    }
}
