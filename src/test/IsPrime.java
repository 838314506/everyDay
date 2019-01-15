package test;

public class IsPrime {
	
	public static void main(String[] args) {
		int num;
		boolean isPrime;
		
		num = 13;
		
		if(num < 2) isPrime = false;
		else isPrime = true;
		
		for(int i = 2;i < num/i;i ++) {
			if(num % 2 == 0) {
				isPrime = false;
				break;
			}
		}
		
		if(isPrime) {
			System.out.println("isPrime");
		}else {
			System.out.println("not isPrime");
		}
		
		int a,b;
		for(a = 1,b = 4;a < b;a ++,b --) {
			System.out.println("a: "+a);
			System.out.println("b: "+b);
		}
	}

}
