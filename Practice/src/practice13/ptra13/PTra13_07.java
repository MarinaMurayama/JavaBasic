/*
 * PTra13_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Item;
import practice13.common.Slime;
import practice13.common.SuperHero;

public class PTra13_07 {

	/*
	 * ★ common.Item, common.SuperHero, common.Slimeを使用します
	 */

	public static void main(String[] args) {

		// ★ SuperHeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者（装備あり）", "スライム"を設定してください
		SuperHero superHero = new SuperHero();
		Slime slime = new Slime();

		superHero.setName("勇者(装備あり)");
		slime.setName("スライム");


		// ★ Itemクラスのインスタンスを作成し、("こんぼう", 4）をコンストラクタの引数にしてください

		Item item = new Item("こんぼう",4);

		// ★ 作成したItemインスタンスをSuperHeroに持たせてください
		superHero.setEquipment(item);

		/*
		 * ★ SuperHeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●SuperHeroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 */

	/*    while(true) {
			System.out.println(hero.getName()+"の攻撃！");
			boolean isSlimeDead = slime.damage(hero.attack());  //boolean型でスライムが生きているか確認。ｈｐがゼロだとtrueが入る。

			if(isSlimeDead) {   //もしtrue(スライムが死んでいたら)実行。
				System.out.println(hero.getName() + "は" + slime.getName() + "との戦闘に勝利した");
				break;   //戦いが終了したらループを強制脱出
			}


			System.out.println(slime.getName()+"の攻撃！");
			boolean isHeroDead = hero.damage(slime.attack());  //boolean型で勇者が生きているか確認

			if(isHeroDead) {
				System.out.println(slime.getName() + "は" + hero.getName() + "との戦闘に勝利した");
				break;
			}
		} */

		boolean heroWin = true;
		while (true) {
			System.out.println(superHero.getName() + "の攻撃");
			int heroAttack = superHero.attack();
			if (slime.damage(heroAttack)) {
				System.out.println(slime.getName() + "は倒れた・・・\n");
				break;
			}

			System.out.println(slime.getName() + "の攻撃");
			int slimeAttack = slime.attack();
			if (superHero.damage(slimeAttack)) {
				System.out.println(superHero.getName() + "は倒れた・・・\n");
				heroWin = false;
				break;
			}
		}

		if (heroWin) {
			System.out.println(superHero.getName() + "は" + slime.getName() + "との戦闘に勝利した");
		} else {
			System.out.println(slime.getName() + "は" + superHero.getName() + "との戦闘に勝利した");
		}


		// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」
	}
}
