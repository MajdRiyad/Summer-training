package streme;

public class Person {
		private String name ;
		private int money ;
		
		public Person (String name ,int money ) {
			this.setName(name) ;
			this.setMoney(money);
			
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getMoney() {
			return money;
		}

		public void setMoney(int money) {
			this.money = money;
		}
}
