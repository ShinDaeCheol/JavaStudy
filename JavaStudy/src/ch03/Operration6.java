package ch03;

import java.util.Scanner;

public class Operration6 {
	// ���ٻ���: ��Ʈ�� +d
	// �ٺ���:��Ʈ�� +��Ʈ+�Ʒ�ȭ��ǥ
	public static void main(String[] args) {
		// �ѱ���(����) �Է�
		Scanner s = new Scanner(System.in);
		System.out.println("�����ڸ� �Է����ּ���.");
		String txt = s.next();
		System.out.println(txt);

		// ������ ù��° ���ڸ� char�β�������
		char txt2 = txt.charAt(0);

		// �Էµ� ���ڰ� ��� �´��� �˻�
		boolean isCorrect = false;
		isCorrect = txt2 >= 'a' && txt2 <= 'z' 
				    || 
				    txt2 >= 'A' && txt2 <= 'Z';

		// ���
		System.out.println(isCorrect);
	}
}