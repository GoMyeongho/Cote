package 대소문자;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().trim();
		for ( int i = 0; i < s.length(); i++) {
		System.out.print((s.charAt(i) > 90)? (char) (s.charAt(i) - 32):(char) (s.charAt(i) + 32));
		}
	}
}
