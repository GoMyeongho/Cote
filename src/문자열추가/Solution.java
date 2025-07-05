package 문자열추가;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String k = sc.nextLine();
		int n = sc.nextInt();
		System.out.println(s.substring(s.length() - n) + k);
	}
}
