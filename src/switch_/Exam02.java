package switch_;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		String home = null, com = null;
		
		while(true) {
			System.out.println("1.우리집 등록");
			System.out.println("2.회사 등록");
			System.out.println("3.등록 보기");
			num = sc.nextInt();
			switch(num){
			case 1: 
				System.out.print("우리집 목적지 입력: ");
				home = sc.next(); 
				System.out.println("등록 성공"); 
				break;
			case 2:
				System.out.print("회사 목적지 입력 : ");
				com = sc.next();
				System.out.println("등록 성공"); 
				break;
			case 3:
				System.out.println("우리집 : "+home);
				System.out.println("회사 : "+com);
			}
		}
	}
}