/*
 * PTra18_01.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PTra18_01 {
	public static void main(String[] args) {

	    // file/BestElevenCandidate.csv に記述された文字列を1行毎に line に代入します。

		ArrayList<String> array = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {

        	while (scanner.hasNext()) {    //☆メモ☆hasNextﾒｿｯﾄﾞ＝繰り返し処理でさらに要素がある場合に true を返す。
                String line = scanner.nextLine();

                // ★ 1行ごとにArrayListに格納してください
                 //☆csvデータ。サッカー（ポジション,名前,国,チーム）が入っている。

                array.add(line);


            }
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }

		// ★ ArrayListに格納された値を全て表示してください
		// ※ できれば拡張for文を使いましょう
//		for (int i = 0; i < array.size(); i++) {
//			System.out.println(array.get(i));
//		}

		for(String str: array) {
			System.out.println(str);
		}
	}
}
