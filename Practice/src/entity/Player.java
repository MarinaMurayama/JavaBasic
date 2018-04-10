package entity;

public class Player {

		private String position,name,country,team;


		public String getPosition() {
			return position ;
		}
		public void setPosition(String position) {
			this.position = position;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getTeam() {
			return team;
		}
		public void setTeam(String team) {
			this.team = team;
		}

		//toString()	：	Objectクラスのオーバーライド
		//各フィールドの値を、カンマ区切りの文字列で取得する
		//☆csvデータ内。（ポジション,名前,国,チーム）が入っている

		@Override
		public String toString() {
		        return this.getPosition()+","+this.getName()+","+this.getCountry()+","+this.getTeam();
		    }
}
