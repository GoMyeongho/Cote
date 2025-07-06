package 숫자합;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int count = 0;
		for (int i = 0; i < n; i++) {
			count += Integer.parseInt(s.substring(i, i + 1));
		}
		System.out.println(count);
		
	}
}
