package ch07;



public class MemberMain {
	public static void total(int n1, int n2) {
		System.out.println(n1 + n2);
	}

	public static void printDate(Member m) {
		System.out.println(m.id);
		System.out.println(m.name);

	}

	public static void printDate(Member[] m) {
		for (int i = 0; i < m.length; i++) {
			printDate(m[i]);
		}
	}

public static void main(String[] args) {
		total(10, 20);
		Member[] m = new Member[2];
	
	    Member m1= new Member();
		m1.id = "ggored"; 
		m1.name = "kim";
		printDate(m1);
		
		Member m2= new Member();
		m2.id = "deacheol"; 
		m2.name = "shin";
		printDate(m2);

		m[0]=m1; m[1]=m2;
				printDate(m);
}

}
