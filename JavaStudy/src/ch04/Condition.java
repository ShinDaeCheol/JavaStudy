package ch04;

public class Condition {
	public static void main(String[] args) {
		int dice1 = 0;
		int dice2 = 0;

		// 0.0<=X<1.0
		dice1 = (int) (Math.random() * 6) + 1; // 1~6
		dice2 = (int) (Math.random() * 6) + 1;
		System.out.println(dice1 + "," + dice2);

		if (dice1 == dice2) {
			System.out.println("�ѹ��� ��������.");
			dice1 = (int) (Math.random() * 6) + 1;
			dice2 = (int) (Math.random() * 6) + 1;
			System.out.println(dice1 + "," + dice2);
		}

		// ���ǽ��� �׻� ture�Ǵ� false��
		char gerder = 'M';
		if (gerder == 'M') {
			System.out.println("����");
			System.out.println("���ھƴ�");
		} else {
			System.out.println("����");
		}

		if (true) {

		}
		boolean a = false;
		if (a) {

		}
	}
}
