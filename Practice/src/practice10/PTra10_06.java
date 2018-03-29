package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Car car1 =new Car();
			car1.serialNo= 10000 ;
			car1.color = "Red" ;
			car1.gasoline = 50 ;

		Car car2 =new Car();
			car2.serialNo= 10000 ;
			car2.color = "Red" ;
			car2.gasoline = 50 ;

		Car car3 =new Car();
			car3.serialNo= 10000 ;
			car3.color = "Red" ;
			car3.gasoline = 50 ;



	}
}
