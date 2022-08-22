package Scanner;

import java.util.Scanner;

public class Solution {
	void add(int a , int b ) {
		System.out.println("Sum of "+a+ " And "+b+" is "+(a+b));
	}
	public static void main(String[] args) {
		Solution s = new Solution();
		Scanner scan = new Scanner(System.in);
		
		for(int i=1; i<=3; i++) {
			System.out.println("Enter the first number: ");
			int a = scan.nextInt();
			System.out.println("Enter the Second number: ");
			int b = scan.nextInt();
			s.add(a,b);
		}
		
		
	}

}
