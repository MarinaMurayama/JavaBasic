/*
 * PTra18_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import entity.Player;

public class PTra18_02 {
	/*
	 * ★ BestElevenCandidate.csvの情報を保持するためのクラス、entity.Playerクラスを作成してください
	 *
	 * フィールド
	 * 		position	：	String
	 * 		name		：	String
	 * 		country		：	String
	 * 		team		：	String
	 * メソッド
	 * 		各アクセサ
	 *
	 * 		toString()	：	Objectクラスのオーバーライド
	 * 		各フィールドの値を、カンマ区切りの文字列で取得する
	 */

	public static void main(String[] args) {
		/*
		 * entity.Playerの作成後に行ってください
		 *
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */

		 ArrayList<Player> array = new ArrayList<>();
	        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
	        	while (scanner.hasNext()) {
	            	String list = scanner.nextLine();
	            	String[]a = list.split(",",0);      //☆「,」で区切る

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

		// ★ ArrayListに格納されているインスタンス全てのtoStringメソッドを実行し、出力してください
		// ※ できれば拡張for文を使いましょう
//	        for(Iterator<Player> it = array.iterator(); it.hasNext();){
//	        	System.out.println(p.toString());
//	        }

	        for(Player player : array) {
	        	System.out.println(player);
	        }
		}
}
