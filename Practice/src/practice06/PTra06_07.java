package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 * ■■■■■
		 * ■■■■□
		 * ■■■□□
		 * ■■□□□
		 * ■□□□□
		 */
		/*	for(int i = 1; i <= 6; i++){
				for(int j = 1;j <= 5; j++){
					if(i <= j){
						System.out.print("□");
					}else{
						System.out.print("■");
					}
				}
				System.out.println();
				}

			for(int i = 1; i <= 4; i++){
				for(int j = 1; j <= 5; j++){
					if( j <= 5 - i ){
						System.out.print("■");
					}else{
						System.out.print("□");
					}
				}
				System.out.println();
			} */

		for (int vi = 0; vi < 5; vi++) { //5列分
			for (int hi = 0; hi < vi; hi++) {//行
				System.out.print("■");
			}
			for (int hj = vi; hj < 5; hj++) {//行 int hj=viがﾎﾟｲﾝﾄ
				System.out.print("□");
			}
			System.out.println();
		}
		for (int vj = 5; vj > 0; vj--) {  //5列分
			for (int hi = 0; hi < vj; hi++) {//行
				System.out.print("■");
			}
			for (int hj = vj; hj < 5; hj++) {//行　int hj=viがﾎﾟｲﾝﾄ
				System.out.print("□");
			}
			System.out.println();
		} //↑上のﾌﾟﾛｸﾞﾗﾑと比較して、ｺﾋﾟﾍﾟして手を加えると色々と活用が出来る。

		}
	}
