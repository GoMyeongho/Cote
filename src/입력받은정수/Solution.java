package 입력받은정수;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for (int i = 0; i < n; i++) {
			count = count + sc.nextInt();
		}
		System.out.println(count);
	}
}
