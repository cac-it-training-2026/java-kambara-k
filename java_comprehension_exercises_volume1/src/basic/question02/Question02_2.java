package basic.question02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第5章 入出力
 */

public class Question02_2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("商品の名前と値段を入力してください。＞");
		String itemName = br.readLine();
		String itemPriceStr = br.readLine();
		int itemPrice = Integer.parseInt(itemPriceStr);

		System.out.println("商品の名前は" + itemName + "です。");
		System.out.println("商品の値段は" + itemPrice + "円です。");

	}
}