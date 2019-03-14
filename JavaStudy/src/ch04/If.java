package ch04;

public class If {
	public static void main(String[] args) {
		// 주석처리 범위지정후(쉬프트+드래그)후 컨트롤+/
		int score = 66;// 현제점수 87
		if (score >= 90) {
			System.out.println("A");
		} else if (score <90&& score >= 80) //이런걸 내포하고있다 
			{
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

	
}
}
