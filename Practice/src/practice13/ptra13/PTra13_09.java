/*
 * PTra13_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Employee;
import practice13.common.Person;

public class PTra13_09 {

	/*
	 * ★ PTra13_08で作成したEmployeeクラスを使用します
	 */

	/** 名前データ（定数） */
	public static final String[] NAMEDATA = {"山田", "佐藤", "小林"};

	/** メールデータ（定数） */
	public static final String[] MAILDATA = {"yamada@hoge.com","satou@hoge.com","kobayashi@hoge.com"};

	/** パスワードデータ（定数） */
	public static final String[] PASSDATA = {"rezo0001","rezo0002","rezo0003"};

	/** 部署データ（定数） */
	public static final String[][] QUATERDATA = {
														{"総務部","業務部","システム部"},//[0][0],[0][1],[0][2]
														{"5","10","35"},      ////[1][0],[1][1],[1][2]
													};
            							//☆メモ☆final修飾子は一度しか値を代入することしかできない。
	/**
	 * エントリーポイント
	 * @param args
	 */
	public static void main(String[] args) {
		// ★ 定数で定義されている各データを使用して、Employeeインスタンスを３つ作成してください
		/*  Employee[] employee = new Employee[3];

		for(int i = 0 ; i < employee.length ; i++) {  //☆配列の要素数分繰り返す

			employee[i] = new Employee();
			employee[i].setDepartmentNm(QUATERDATA[0][i]); //☆部署
			employee[i].setDepartmentCnt(Integer.parseInt(QUATERDATA[1][i]));   //☆部署人数
			employee[i].setUserId(Person.BASE_NO + i);             //☆ユーザーID
			employee[i].setUserNm(NAMEDATA[i]);      //☆山田から
			employee[i].setMail(MAILDATA[i]);       //☆山田のメールから順番に
			employee[i].setPassword(PASSDATA[i]);  //☆山田のパスワードから順番に
		} */

				Employee[] employees = new Employee[NAMEDATA.length];  //名前(人数分)の配列要素を用意する

				for (int i = 0; i < employees.length; i++) {
					employees[i] = new Employee();       //ｲﾝｽﾀﾝｽ
					employees[i].setUserId(Person.BASE_NO + i);  //personｸﾗｽのﾅﾝﾊﾞｰ + 1
					employees[i].setUserNm(NAMEDATA[i]);
					employees[i].setMail(MAILDATA[i]);
					employees[i].setPassword(PASSDATA[i]);
					employees[i].setDepartmentNm(QUATERDATA[0][i]);
					employees[i].setDepartmentCnt(Integer.parseInt(QUATERDATA[1][i])); //これだけはint型を渡すので。
				}

				// 出力用
				for (Employee emp : employees) {
					System.out.println("---------------------------------");
					System.out.println("ID:" + emp.getUserId());
					System.out.println("名前：" + emp.getUserNm());
					System.out.println("メールアドレス：" + emp.getMail());
					System.out.println("パスワード：" + emp.getPassword());
					System.out.println("部署：" + emp.getDepartmentNm());
					System.out.println("部署人数：" + emp.getDepartmentCnt());
				}

	}
}
