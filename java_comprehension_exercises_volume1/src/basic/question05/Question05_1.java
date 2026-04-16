package basic.question05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第8章 条件分岐
 */

public class Question05_1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("年齢を入力してください。＞");
		String ageStr = br.readLine();
		int age = Integer.parseInt(ageStr);

		if (age < 20) {
			System.out.println("20 歳未満なので、お酒の提供ができません。");
		} else if (age >= 20) {
			System.out.println("20 歳以上なので、お酒を提供することが可能です。");
		}
	}
}
