package quiz;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		//1부터 30까지 수에서 4의 배수와 3의 배수를 찾기 겹치는 배수는 겹치는 수라고 표현하기
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=1; i<=30; i++) {
			if(i%3==0 && i%4!=0) {
				System.out.println(i);
			} else if(i%3!=0 && i%4==0) {
				System.out.println(i);
			} else if(i%3==0 && i%4==0) {
				System.out.println(i+"는 3과 4의 배수");
			}
		}
	}
}