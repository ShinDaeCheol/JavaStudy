package ch03;

import java.util.Scanner;

public class exam07 {

	public static void main(String[] args) {
		int num = 12345;
		// 코드 작성 (% 연산자)
		int num1, num2, num3, num4, num5;

	//	int result = num1 * 10;
		num1 = num % 10; // 5
		
		num = num / 10; // 1234
		num2 = num % 10; // 4

		num = num / 10; // 123
		num3 = num % 10; // 3

		num = num / 10; // 12
		num4 = num % 10; // 2

		num = num / 10; // 1
		num5 = num % 10; // 1

		int total = num1 + num2 + num3 + num4 + num5;
		System.out.println("각 자리 숫자의 합 : " + total);
	}

}
