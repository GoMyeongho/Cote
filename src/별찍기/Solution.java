package 별찍기;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println();
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
		}
	}
}
