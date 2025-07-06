package 세자리정수;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Math.max(Math.max(n % 10, n / 100 ), n / 10 % 10));
	}
}
