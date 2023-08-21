package Lb2;

import java.util.Scanner;

public class lession2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число :");
		String num = sc.nextLine();
		int digitSum = 0;
		
		for(int i = 0; i<num.length(); i++) {
			digitSum = digitSum + num.charAt(i)-'0';
		}
		if(digitSum % 3 == 0) {
			System.out.println("Данное число делится на 3");
		} else {
			System.out.println("Данное число не делится на 3");
			
		}
		
	}

}
