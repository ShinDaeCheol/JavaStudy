package ch04;

public class Exam4_8 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 1000; i++) {
			// 1 ~ 1000 사이의 숫자 중 3을 포함하고 있는 숫자를 출력
			int num = i;
			while (num > 0) {
				int n = num % 10;
				if (n == 3) {
					System.out.println(i);
					break;
				}
				num = num / 10;
			}
		}
		System.out.println(count);

		}

	}

