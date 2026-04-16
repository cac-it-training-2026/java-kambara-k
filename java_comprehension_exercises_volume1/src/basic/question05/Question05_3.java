package basic.question05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第8章 条件分岐
 */

public class Question05_3 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("曜日を日本語で入力してください。＞");
		String userDayInput = br.readLine();

		switch (userDayInput) {
		case "月曜日":
			System.out.println("Monday");
			break;
		case "火曜日":
			System.out.println("Tuesday");
			break;
		case "水曜日":
			System.out.println("Wendnesday");
			break;
		case "木曜日":
			System.out.println("Thursday");
			break;
		case "金曜日":
			System.out.println("Friday");
			break;
		case "土曜日":
			System.out.println("Saturday");
			break;
		case "日曜日":
			System.out.println("Sunday");
			break;
		}
	}
}
