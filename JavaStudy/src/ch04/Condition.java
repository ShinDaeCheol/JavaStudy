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
			System.out.println("한번더 던지세요.");
			dice1 = (int) (Math.random() * 6) + 1;
			dice2 = (int) (Math.random() * 6) + 1;
			System.out.println(dice1 + "," + dice2);
		}

		// 조건식은 항상 ture또는 false로
		char gerder = 'M';
		if (gerder == 'M') {
			System.out.println("남자");
			System.out.println("여자아님");
		} else {
			System.out.println("여자");
		}

		if (true) {

		}
		boolean a = false;
		if (a) {

		}
	}
}
