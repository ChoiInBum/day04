package switch_;

import java.util.Scanner;

public class TestClass02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.print("수 입력 >> ");
		num = sc.nextInt();
		
		//if(num%2==0) {}
		
		switch(num%2) {
			case 1: System.out.println("홀수 : "+num);
			break;
			case 0: System.out.println("짝수 : "+num);
		}
		System.out.println("다음 문장들 실행!!!");
	}
}