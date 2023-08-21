package project1;
import java.util.Scanner;
public class lession6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        int x;
        x = number / 1000;
        if (x > 0)
        {
            System.out.println("Число имеет " + x + " тысяч");
        }
        else {
            System.out.println("Число не удовлетворяет условию (оно меньше 1000)");
            scanner.close();
        }

	}

}
