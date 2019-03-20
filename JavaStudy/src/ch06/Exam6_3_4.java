package ch06;

public class Exam6_3_4 {
	public static String dilemma(boolean a, boolean b) {
		String result = "";
		if(a == true && b==false) {
			result = "A석방, B 10년";
		}else if(a != true && b == true) {
			result ="A 10년, B 석방";
		}else if(a && b) {
			result = "A 5년, B 5년";
		}else if(!a&&!b) {
			result = "A1년, B 1년";
		}
		return result;
	}
	
	
	
	
	public static void main(String[] args) {
	System.out.println(dilemma(false, true));
}
}
