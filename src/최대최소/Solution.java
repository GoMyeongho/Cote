package 최대최소;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(Math.max(Math.max(a,b), c));
		System.out.println(Math.min(Math.min(a,b), c));
	}
}
