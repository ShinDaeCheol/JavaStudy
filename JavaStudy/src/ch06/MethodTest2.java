package ch06;

//메소드 생성 규칙
//반드시 클래스 내에 표현되어야한다.
//메소드 내에 표현할수 없음.
//위치 상관없음.
public class MethodTest2 {
	private static final String sum = null;

	public static boolean hasNegative(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]<0) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,-9};
		boolean b = hasNegative(arr);
		System.out.println(b);
		//위 배열에 음수가 있는지 검사
	}

	double avg = average(sum);

	private double average(String sum2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
