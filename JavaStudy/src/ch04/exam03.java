package ch04;

public class exam03 {
	public static void main(String[] args) {

		int score = 26;
		if (score % 2 == 0 && score % 3 == 0) {
			System.out.println("��¦");
		} else if (score % 2 == 0) {
			System.out.println("¦");
		} else if (score % 3 == 0) {
			System.out.println("��");
		}

	}
}
