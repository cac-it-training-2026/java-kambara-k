package basic.question01;

/**
 * 第4章 変数
 */

public class Question01_2 {

	public static void main(String[] args) {

		int applePrice = 100;
		String stationery = "鉛筆";
		int bananaPrice = applePrice;
		String writingUrensils = stationery;

		System.out.println("りんごの値段は" + applePrice + "です。");
		System.out.println("りんごの値段は" + bananaPrice + "です。");
		System.out.println("この筆記用具は" + writingUrensils + "です。");

	}

}
