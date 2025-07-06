package 소수;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = (int) Math.sqrt((double) n);
		boolean flag = true;
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i < m; i++) {
			flag = true;
			for (Integer integer : list) {
				if ((i + 1) % integer == 0) {
					flag = false;
					break;
				}
			}
			if (flag) list.add(i + 1);
		}
		flag = true;
		for (Integer integer : list) {
			if (n % integer == 0) {
				flag = false;
				break;
			}
		}
		System.out.println(flag);
	}
}
