package practice13.common;

public class SuperHero extends Hero{

	private Item equipment;


	//attackメソッドをオーバーライドし、
		//powerに加えて、additionalDamage分を加算した値としてください

	public int attack() {
		return super.attack()+this.equipment.getAdditionalDamage();   //ﾌｨｰﾙﾄﾞでItemｸﾗｽのequipmentを作っているからgetAdditionalDamage()も呼べる
	}    //HeroクラスはCharacterも継承しているから、SuperHeroも"super"をつけるだけでCharacterのattack()を呼び出せる。


	public Item getEquipment() {
		return equipment;
	}


	public void setEquipment(Item equipment) {
		this.equipment = equipment;
	}
}
