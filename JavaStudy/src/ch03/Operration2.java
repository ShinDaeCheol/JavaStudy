package ch03;

import java.util.Scanner;

public class Operration2 {
	// 한줄삭제: 컨트롤 +d

	public static void main(String[] args) {
// 줄복사:컨트롤 +알트+아래화살표
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		boolean 배수 = num % 3 == 0;
		System.out.println(배수);
		s.close();

	}

}
