package basic.question04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第7章 配列
 */

public class Question04_2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] ageGroup = new int[6];
		ageGroup[0] = 23;
		ageGroup[1] = 33;
		ageGroup[2] = 26;
		ageGroup[3] = 21;
		ageGroup[4] = 25;
		ageGroup[5] = 22;

		System.out.print("4 番目の人の年齢を入力してください。＞");
		String numStr = br.readLine();
		int temporaryAge = Integer.parseInt(numStr);

		ageGroup[3] = temporaryAge;

		System.out.println("4 番目の人の年齢は" + ageGroup[3] + "歳です。");
		System.out.println("人数は" + ageGroup.length + "人です。");

	}

}
