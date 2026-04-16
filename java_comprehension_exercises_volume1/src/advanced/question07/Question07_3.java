package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 100, 200, 300, 400, 500 };
		// 購入数（変更不可）
		int[] amounts = new int[5];

		int[] stocks = new int[5];
		System.out.println("各商品の在庫数を入力してください。 ");

		for (int i = 0; i < 5; i++) {
			System.out.print(itemNames[i] + "の在庫数: ");
			String stockStr = br.readLine();
			int stock = Integer.parseInt(stockStr);
			stocks[i] = stock;
		}

		System.out.println("\n商品の購入数を入力してください。 ");

		for (int i = 0; i < 5; i++) {
			System.out.print(itemNames[i] + "の購入数: ");
			String amountStr = br.readLine();
			int amount = Integer.parseInt(amountStr);
			amounts[i] = amount;
			if (amounts[i] > stocks[i]) {
				System.out.println("在庫を超えています。もう一度入力してください。");
				--i;
				continue;
			}
		}

		System.out.println("\n商品名及び購入数と在庫数");

		for (int i = 0; i < 5; i++) {
			System.out.println(itemNames[i] + " : 購入" + amounts[i] + "個");
			System.out.println("在庫 " + stocks[i] + " 個");
		}

		System.out.println("\n小計金額");
		int totalPrice = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println(itemNames[i] + " : " + (prices[i] * amounts[i]) + " 円");
			totalPrice = totalPrice + (prices[i] * amounts[i]);
		}

		System.out.println("\n合計金額");
		System.out.println(totalPrice + " 円");

	}
}
