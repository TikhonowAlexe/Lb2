package Lb2;

import java.util.Scanner;

public class lession4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число: ");
		int number = scanner.nextInt();
		
		int x;
        x = number % 4;
        if (x == 0)
        {
            System.out.println("Число делится на 4");
        }
        else {
            System.out.println("Число не делится на 4");
        }
        if (number > 10)
        {
            System.out.println("Число больше 10");
        }
        else {
            System.out.println("Число  меньше 10)");      

            scanner.close();
        }
	
	 
	}

}
