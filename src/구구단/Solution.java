package 구구단;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for ( int i = 0; i < 9; i++) {
			System.out.println(n + " x " + (i+1) + " = " + n*(i+1));
		}
	}
}
