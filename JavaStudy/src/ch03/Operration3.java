package ch03;

import java.util.Scanner;

public class Operration3 {
	// ���ٻ���: ��Ʈ�� +d

	public static void main(String[] args) {
// �ٺ���:��Ʈ�� +��Ʈ+�Ʒ�ȭ��ǥ
		Scanner s = new Scanner(System.in);
		System.out.println("ù��°���ڸ� �Է����ּ���.");
		int num1 = s.nextInt();
		System.out.println("�ι�°���ڸ� �Է����ּ���.");
		int num2 = s.nextInt();
		
		System.out.println(num1 + "  " + num2);
		

		boolean result = (num1 * num2) % 6 == 0;
		System.out.println(result);
		
		
		
		
		
		

	}
}