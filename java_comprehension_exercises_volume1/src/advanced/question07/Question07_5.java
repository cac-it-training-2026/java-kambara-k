package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_5 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 登録商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 120, 80, 50, 250, 100 };
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

		int totalPrice = 0;
		int taxIncludedTotalPrice = 0;
		for (int i = 0; i < 5; i++) {
			totalPrice = totalPrice + (prices[i] * amounts[i]);
			taxIncludedTotalPrice = taxIncludedTotalPrice + (int) (prices[i] * amounts[i] * 1.1);
		}

		System.out.println("\n購入内容一覧：");
		for (int i = 0; i < 5; i++) {
			System.out.println(itemNames[i] + " : 単価 " + prices[i] + " 円（税込 "
					+ (int) (prices[i] * 1.1) + " 円）× " + amounts[i] + " 個 = "
					+ (int) (prices[i] * amounts[i] * 1.1) + " 円");
		}
		System.out.println("合計（税込）: " + taxIncludedTotalPrice + " 円");

		int discountTaxIncludedTotalPrice = (int) (taxIncludedTotalPrice * 0.9);
		System.out.println("割引後合計（税込）: " + discountTaxIncludedTotalPrice + " 円");

	}
}