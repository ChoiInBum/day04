package switch_;

public class TestClass01 {
	public static void main(String[] args) {
		/*
		switch(식) {
			case 1: 내용; break;
			case 2: 내용; break;
			...
			default : 내용;
		}
		*/
		int select = 2;
		switch(select) {
			case 1: System.out.println("1. 입력"); break;
			case 2: System.out.println("2. 입력"); break;
			default: System.out.println("1, 2 제외한 다른 값");
		}
		System.out.println("다음 문장들 실행!!!");
		
		/*
		if(select == 1) {
			
		} else if(select == 2) {
			
		} else {
			
		}
		*/
	}
}