package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] itemNames = new String[5];

		for (int i = 0; i < 5; i++) {
			System.out.print("商品" + (i + 1) + "を入力してください: > ");
			String itemName = br.readLine();
			itemNames[i] = itemName;
		}

		System.out.println("\n各商品の単価を順に入力してください: ");

		int[] prices = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.print(itemNames[i] + "の単価: >");
			String pricesStr = br.readLine();
			int price = Integer.parseInt(pricesStr);
			prices[i] = price;
		}

		System.out.println("\n登録商品一覧");
		for (int i = 0; i < 5; i++) {
			System.out.println(itemNames[i] + " : " + prices[i] + " 円");
		}
	}
}
