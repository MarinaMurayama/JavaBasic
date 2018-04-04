package practice13.common;

public class Item {

	 private String name ;
	 private int additionalDamage;


	 public Item(String name,int intadditionalDamage ) {
			this.name = name;
			this.additionalDamage = intadditionalDamage;
		}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAdditionalDamage() {
		return additionalDamage;
	}
	public void setAdditionalDamage(int additionalDamage) {
		this.additionalDamage = additionalDamage;
	}

	 //コンストラクタ
	 //name, additionalDamageに初期値を設定するコンストラクタ
	 //上記2つを設定するための引数を持つ

}
