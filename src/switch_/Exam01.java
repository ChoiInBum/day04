package switch_;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		while(true) {
			System.out.print("날짜(정수) 입력 : ");
			num = sc.nextInt();
			
			switch(num%7) {
			case 0: System.out.println("일요일"); break;
			case 1: System.out.println("월요일"); break;
			case 2: System.out.println("화요일"); break;
			case 3: System.out.println("수요일"); break;
			case 4: System.out.println("목요일"); break;
			case 5: System.out.println("금요일"); break;
			case 6: System.out.println("토요일"); break;
			}
		}
	}
}