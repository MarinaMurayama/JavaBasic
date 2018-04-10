/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> array = new ArrayList<>();
		try (Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
			while (scanner.hasNext()) {

				String list = scanner.nextLine();
				String[] a = list.split(",", 0); //☆「,」で区切る

				//クラスのインスタンスにセット
				Player p = new Player(); //ｲﾝｽﾀﾝｽは同じ名前でも大丈夫
				p.setPosition(a[0]);
				p.setName(a[1]);
				p.setCountry(a[2]);
				p.setTeam(a[3]);

				array.add(p);
			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		}

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください

		Collections.shuffle(array);

		int gkCount = 0;
		int dfCount = 0;
		int mfCount = 0;
		int fwCount = 0;


		for (Player player : array) {
			if (player.getPosition().equals("GK")) {
				if (gkCount < 1) {
					System.out.println(player.toString());
					gkCount++;
				}
			}

			if (player.getPosition().equals("DF")) {
				if (dfCount < 4) {
					System.out.println(player.toString());
					dfCount++;
				}
			}


			if (player.getPosition().equals("MF")) {
				if (dfCount < 4) {
					System.out.println(player.toString());
					mfCount++;
				}
			}

		if (player.getPosition().equals("FW")) {
				if (dfCount < 2) {
					System.out.println(player.toString());
					fwCount++;
				}
			}
		}
	}
}
