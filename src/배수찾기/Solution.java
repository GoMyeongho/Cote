package 배수찾기;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String[] ans = {" is a multiple of ", " is NOT a muliple of "};
		while(m != 0){
			System.out.println(m + ans[Math.min(m % n, 1)] + n);
			m = sc.nextInt();
		}
	}
}
