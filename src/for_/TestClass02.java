package for_;

public class TestClass02 {
	public static void main(String[] args) {
		int sum = 0;
		//sum = sum + i; i++;
		for(int i=1; i<=3; i++) {
			sum = sum + i;
		}
		
		System.out.println("sum : "+sum);
	}
}