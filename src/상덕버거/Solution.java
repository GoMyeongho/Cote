package 상덕버거;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] burger = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
		int[] drink = {sc.nextInt(), sc.nextInt()};
		System.out.println(Math.min(burger[0], Math.min(burger[1], burger[2])) + Math.min(drink[0], drink[1]) - 50);
	}
}
