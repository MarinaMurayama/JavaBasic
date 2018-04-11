package practice05;
/*
 * PTra05_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra05_04 {
	public static void main(String[] args) {
		// 入力型プログラムです。
		// 下記の命令は、入力型プログラムで必要な記述になります。
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		/*
		 * 以下のプログラムは未完成です。
		 * ★ 下記の仕様に合わせて、プログラムを修正してください
		 *
		 * ●2～6まで、それぞれ火曜～土曜を出力するようにしてください
		 * ●0～6以外が入力された場合は①に戻るようにしてください
		 * ●0～6が入力されている場合は、各曜日を出力した後プログラムを終了します
		 *
		 */

		// ①
       	/*	boolean weekFlg = false;

			while (!weekFlg ) {

				System.out.println("0～6の整数を入力してください");

				String line = scanner.nextLine();
				int week = Integer.parseInt(line) ;  ←入力された文字を数字にして使いたかったので。


				switch(week) {

					case 0: weekFlg = !weekFlg ;  ←全部につけるとごちゃつく。修正する時にも面倒。
						System.out.println("日曜");
						break;

					case 1: weekFlg = !weekFlg ;
						System.out.println("月曜");
						break;

					case 2: weekFlg = !weekFlg ;
						System.out.println("火曜");
						break;

					case 3: weekFlg = !weekFlg ;
						System.out.println("水曜");
						break;

					case 4: weekFlg = !weekFlg ;
						System.out.println("木曜");
						break;

					case 5: weekFlg = !weekFlg ;
						System.out.println("金曜");
						break;

					case 6: weekFlg = !weekFlg ;
						System.out.println("土曜");
						break;
					}
				}
				*/

		boolean loopFlg = true;
		while (loopFlg) {  //loopFlgがtrueの間は繰り返す
			// ①
			System.out.println("0～6の整数を入力してください");

			String line = scanner.nextLine();
			loopFlg = false; //ここポイント

			switch(line) {
				case "0":     //☆メモ☆入力したものがString型でも"0"と文字表記にすればそのまま使える。
					System.out.println("日曜");
					break;
				case "1":
					System.out.println("月曜");
					break;
				case "2":
					System.out.println("火曜");
					break;
				case "3":
					System.out.println("水曜");
					break;
				case "4":
					System.out.println("木曜");
					break;
				case "5":
					System.out.println("金曜");
					break;
				case "6":
					System.out.println("土曜");
					break;
				default:
					System.out.println("正しい値を入力してください");
					loopFlg = true; //ここポイント
			}
		}
				}
			}



