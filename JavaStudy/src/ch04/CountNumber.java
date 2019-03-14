package ch04;

import java.util.Scanner;

public class CountNumber {
public static void main(String[] args) {
//	1~N 의 숫자를 문자열로 가지는 데이터가 있다
//	8이 몇 개가 존재하는지 카운팅하는 프로그램을 작성하라
		System.out.println("숫자를 입력하시오.=>");
		Scanner s = new Scanner(System.in);
		int num=s.nextInt();
		int count=0;
		for(int i=1; i<=num; i++) {
			int n=i;
			while(n>0) {
				int n2=n%10;
				if(n2==8) {
					count++;
				}
				n=n/10;
			}
		}
System.out.println("8의 개수"+count);
}
}
