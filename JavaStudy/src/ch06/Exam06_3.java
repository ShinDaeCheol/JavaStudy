package ch06;

public class Exam06_3 {
	public static  int checkGrade(int s) {
		
	    if (s > 10) {
			s = 1;
		} else if (s > 7) {
			s = 2;
		} else if (s > 4) {
			s = 3;
		} else {
			s = 4;
		}
		return s;
	}

	public static void main(String[] args) {
 
		System.out.println(checkGrade(2));
}
}

