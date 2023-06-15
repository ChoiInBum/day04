package quiz;

import java.util.Scanner;

/*
	1. 두 정수를 입력하여 두 정수 사이의 합을 구하고 각 홀짝의 합을 구하고 비교하시오.
	
	Ex)
	두 정수 입력 >> 10 2
	2~10의 합 : 54
	짝수의 합 : 30
	홀수의 합 : 24
	짝수의 합이 더 큽니다.
*/
public class Exam01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, temp;
		int odd=0, even=0, sum=0;
		String str;
		
		System.out.print("두 정수 입력 >> ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if(num1>num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;			
		}
		
		for(int i=num1; i<=num2; i++) {
			sum+=i;
			
			if(i%2==0) {
				even += i;
			} else if(i%2!=0) {
				odd += i;
			}
		}
		
		str = (even>odd) ? "짝수의 합이 더 큽니다." : (even==odd) ? "각 합이 같습니다." : "홀수의 합이 더 큽니다.";
		System.out.println("-----------------");
		System.out.println(num1+"~"+num2+"의 합 : "+sum);
		System.out.println("짝수의 합 : "+even);
		System.out.println("홀수의 합 : "+odd);
		System.out.println(str);		
	}
}