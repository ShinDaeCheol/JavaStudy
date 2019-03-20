package ch06;

//메소드 생성 규칙
//반드시 클래스 내에 표현되어야한다.
//메소드 내에 표현할수 없음.
//위치 상관없음.
public class MethodExam1 {
	public static void main(String[] args) {
		printStar(5, '★');
	}

	public static void printStar(int count, char ch) {
		for (int i = 1; i <= count; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
