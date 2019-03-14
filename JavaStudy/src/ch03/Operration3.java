package ch03;

import java.util.Scanner;

public class Operration3 {
	// 한줄삭제: 컨트롤 +d

	public static void main(String[] args) {
// 줄복사:컨트롤 +알트+아래화살표
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째숫자를 입력해주세요.");
		int num1 = s.nextInt();
		System.out.println("두번째숫자를 입력해주세요.");
		int num2 = s.nextInt();
		
		System.out.println(num1 + "  " + num2);
		

		boolean result = (num1 * num2) % 6 == 0;
		System.out.println(result);
		
		
		
		
		
		

	}
}