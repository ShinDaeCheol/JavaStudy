package ch03;

import java.util.Scanner;

public class exam09 {

	public static void main(String[] args) {
		 char ch = 'T';
		 char lowerCase = (ch>'A'&&ch<'Z')         /* A 보다 크고 Z 보다 적은 경우 */
	     ? ((char)(ch+32)  )                                    /* ch + 32 */
         : ch;
		 System.out.println("ch : " + ch);
		 System.out.println("ch to lowerCase : " + lowerCase);  //왜 t가나오나??
		
	
	
	
	
	
	}


	
}
