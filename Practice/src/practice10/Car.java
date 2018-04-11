package practice10;

import java.util.Random;

public class Car {

	int serialNo ;
	String color ;
	int gasoline ;


	//ガソリンを1消費して、ランダムな距離(1～15)進む（戻り値が進んだ距離）
		//ガソリンが負の数になった場合（もう進めない）は-1を返します。

/*	int mileage = 0 ;

	public int run() {
		int random= 15;
        mileage= new java.util.Random().nextInt(random) +1 ;

        gasoline -= 1 ;

        if( gasoline < 0) {
        	return -1 ;
        }else {
        	return mileage ;
        }
	} */

	int run() {
		// もう減らせない場合
		if (gasoline == 0) {   //☆if文を一番前に書くのがﾎﾟｲﾝﾄ。ｶﾞｿﾘﾝがｾﾞﾛになっていたらすぐに-1を返す。
			return -1;
		}

		gasoline--;  //ｶﾞｿﾘﾝを１消費してﾗﾝﾀﾞﾑで距離を出す。

		Random random = new Random();  //Randomｸﾗｽのｲﾝｽﾀﾝｽ。
		int distance = random.nextInt(15) + 1; //+１忘れずに。
		return distance; //ﾗﾝﾀﾞﾑな数を返すよ
	}
}

