package sba2;

import java.util.Scanner;

public class ChessWithKnight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the position of knight with comma");
		String s = input.next();
		System.out.println("Enter the position of king with comma");
		String s1 = input.next();
		System.out.println(s + " " + s1);
		String a[] = s.split(",");
		String a1[] = s1.split(",");
		int kn[] = new int[a.length];
		int k[] = new int[a1.length];
		for (int i = 0; i < a.length; i++)
			kn[i] = Integer.parseInt(a[i]);
		for (int i = 0; i < a1.length; i++)
			k[i] = Integer.parseInt(a1[i]);

		int x = kn[0], y = kn[1], n = 0, n1 = 0;
		System.out.println(x + "and" + y);
		int moves[][] = { { -2, 1 }, { -2, -1 }, { -1, -2 }, { 1, -2 }, { 2, -1 }, { 2, 1 }, { 1, 2 }, { -1, 2 } };
		boolean t = false;
		System.out.println("Possible moves are:");
		for (int i = 0; i < moves.length; i++) {
			n = x + moves[i][0];
			n1 = y + moves[i][1];
			if ((n > 0 && n < 8) && (n1 < 8 && n1 > 0)) {
				System.out.print("{" + n + "," + n1 + "}");
				System.out.println();
				if (n == k[0] && n1 == k[1]) {
					//System.out.println("n=" + n + "k=" + k[0] + "n1=" + n1 + "k1=" + k[1]);
					t = true;
				}
			}
		}
		if (t) {
			System.out.println("Check");
		} else
			System.out.println("Not check");
	}
}
