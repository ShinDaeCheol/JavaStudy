package ch03;

public class Operration4 {
	// ���ٻ���: ��Ʈ�� +d

	public static void main(String[] args) {
// �ٺ���:��Ʈ�� +��Ʈ+�Ʒ�ȭ��ǥ
		int num = 2324;
		while (num > 0) {
			int n = num % 10; // �������ڸ��� �����
			System.out.println(n);

			num = num / 10;
		}

//		// ù��°4 ����
//		
//		int n1 = num % 10; // 4
//
//		// �ι�°2���ڶ���
//		num = num / 10; // 232
//		int n2 = num % 10; // 2
//
//		// ����°3���ڶ���
//		num = num / 10; // 23
//		int n3 = num % 10; // 3
//
//		// ����°2���ڶ���
//		num = num / 10; // 2
//		int n4 = num % 10; // 2
//
//		System.out.println(n1+n2+n3+n4);
	}
}