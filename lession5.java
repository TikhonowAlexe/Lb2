package Lb2;

import java.util.Scanner;

public class lession5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число от 5 дло 10: ");
		int number = scanner.nextInt();
		
		 if (number < 11 & number > 4)
	        {
	            System.out.println("Число удовлетворяет условию");
	        }
	        else {
	            System.out.println("Число не удовлетворяет условию");
	        }

	        scanner.close();
        

	}

}
