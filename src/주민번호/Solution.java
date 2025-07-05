package 주민번호;


import java.time.LocalDate;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().trim();
		int month = Integer.parseInt(s.substring(2, 4));
		int day = Integer.parseInt(s.substring(4, 6));
		int gender = Integer.parseInt(s.substring(7, 8));
		int year = Integer.parseInt(s.substring(0, 2)) + 1800 + 100*((gender+1)/2);
		System.out.println(year + "년" + month + "월" + day + "일");
		System.out.println(gender % 2 == 1 ? "남성" : "여성");
		System.out.println(LocalDate.now().getYear() - year + 1);
	}
}
