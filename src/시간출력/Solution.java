package 시간출력;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] strList = str.split(":");
		int h = Integer.parseInt(strList[0]);
		int m = Integer.parseInt(strList[1]);
		int s = Integer.parseInt(strList[2]);
		String hour = h > 11 ? "오후" + (h - 12) : "오전" + h ;
		String min = m > 9 ? String.valueOf(m) : "0" + m;
		String sec = s > 9 ? String.valueOf(s) : "0" + s;
		System.out.println(hour + "시" + min + "분" + sec + "초");
	}
}
