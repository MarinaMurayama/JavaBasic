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

		Car cars[] = new Car[3];


		Car cars1= new Car();
			cars1.serialNo= 10000 ;
			cars1.color = "Red" ;
			cars1.gasoline = 50 ;

		Car cars2 = new Car();
			cars2.serialNo= 20000 ;
			cars2.color = "Blue" ;
			cars2.gasoline = 40 ;

		Car cars3 = new Car();
			cars3.serialNo= 30000 ;
			cars3.color = "Yerrow" ;
			cars3.gasoline = 30 ;


			cars[0] = cars1;
			cars[1] = cars2;
			cars[2] = cars3;


			final int distance = 300 ;


			for(int i = 0 ; i < cars.length; i++) {
				int n = 0;
				int total = 0;
			while(distance > total) {

				 cars[i].run();

				n++ ;

				if(cars[i].mileage == -1) {
					System.out.println("目的地に到達できませんでした");
				}else {
					total += cars[i].mileage ;
				}
			}
				int x = cars[i].gasoline ;

			System.out.println("目的地にまで"+ n + "時間かかりました。残りのガソリンは、" + x + "リットルです");
		}
	}
}

