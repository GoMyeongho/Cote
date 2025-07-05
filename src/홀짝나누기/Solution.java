package 홀짝나누기;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		ArrayList<Integer> odd = new ArrayList<Integer>();
		ArrayList<Integer> even = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int temp = 0;
		for (int i = 0; i < 7; i++) {
			temp = sc.nextInt();
			if (temp % 2 == 1) {
				odd.add(temp);
			}  else {
				even.add(temp);
			}
		}
		System.out.println(odd);
		System.out.println(even);
	}
}
