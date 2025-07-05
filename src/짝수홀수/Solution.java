package 짝수홀수;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(a % 2 == 1 ? "홀수" : "짝수");
	}
}
