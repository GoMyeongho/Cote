package 평균점수;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		for (int i = 0; i < 5; i++) {
			count += Math.max(sc.nextInt(), 40);
		}
		System.out.println(count/5);
	}
}
