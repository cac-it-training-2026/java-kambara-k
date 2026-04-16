package basic.question02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第5章 入出力
 */

public class Question02_1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("名前を入力してください。＞");
		String name = br.readLine();

		System.out.print("好きなスポーツを入力してください。＞");
		String hobby = br.readLine();

		System.out.println("私の名前は" + name + "です。");
		System.out.println("好きなスポーツは" + hobby + "です。");

	}
}
