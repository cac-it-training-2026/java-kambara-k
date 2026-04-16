package basic.question05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第8章 条件分岐
 */

public class Question05_4 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("数学の試験結果の点数を入力してください。＞");
		String mathStr = br.readLine();
		int math = Integer.parseInt(mathStr);

		System.out.print("国語の試験結果の点数を入力してください。＞");
		String japaneseStr = br.readLine();
		int japanese = Integer.parseInt(japaneseStr);

		if (math >= 60 && japanese >= 60) {
			System.out.println("数学と国語ともに合格です。");
		} else if (math >= 60 || japanese >= 60) {
			System.out.println("数学、国語どちらかが合格です。 ");
		} else {
			System.out.println("どちらの教科も不合格です。 ");
		}

	}
}
