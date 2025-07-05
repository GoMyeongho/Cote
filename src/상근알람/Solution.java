package 상근알람;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int time = (sc.nextInt()* 60 + sc.nextInt() + 1395) % 1440;
		System.out.println(time/60 + ":" + time%60);
	}
}
