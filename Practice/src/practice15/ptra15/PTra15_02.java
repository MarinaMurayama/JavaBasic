/*
 * PTra15_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice15.ptra15;

import practice15.common.Java2Month;
import practice15.common.Room;

public class PTra15_02 {
	public static void main(String[] args) {

		Room room = new Java2Month();     //Java2MonthｺｰｽはRoomｺｰｽを継承している

		// roomに格納されたJava2MonthインスタンスのgetCurriculumメソッドを呼び出してください

		Java2Month jroom = (Java2Month)room;//←☆キャスト☆  String[]list = room.getCurriculum();ではエラーになるので
		String[]list = jroom.getCurriculum();//roomからJava2Monthへクラスを強制変換。

		// 取得したカリキュラム情報を全て出力してください

		for(String curriculum : list ) {
		System.out.println(curriculum);
		}
	}
}
