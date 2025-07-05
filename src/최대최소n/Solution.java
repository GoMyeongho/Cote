package 최대최소n;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = sc.nextInt();
		int max = min;
		int temp = 0;
		for (int i = 0; i < n-1; i++){
			temp = sc.nextInt();
			if (temp < min) min = temp;
			if (temp > max) max = temp;
		}
		System.out.println(max);
		System.out.println(min);
	}
}
