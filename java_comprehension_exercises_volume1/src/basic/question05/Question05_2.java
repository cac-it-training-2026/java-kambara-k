package basic.question05;

import java.io.IOException;

/**
 * 第8章 条件分岐
 */

public class Question05_2 {

	public static void main(String[] args) throws IOException {

		int[] numberGroup = new int[4];
		numberGroup[0] = 3;
		numberGroup[1] = 5;
		numberGroup[2] = 7;
		numberGroup[3] = 9;

		if (numberGroup[3] == 3) {
			System.out.println("4 番目の要素の値は 3 です。");
		} else if (numberGroup[3] == 5) {
			System.out.println("4 番目の要素の値は 5 です。");
		} else if (numberGroup[3] == 7) {
			System.out.println("4 番目の要素の値は 7 です。");
		} else {
			System.out.println("4 番目の要素の値は 3、5、7 以外の値です。");
		}
	}
}
