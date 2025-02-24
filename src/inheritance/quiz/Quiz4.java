package inheritance.quiz;

public class Quiz4 {

	public static void main(String[] args) {
		
		Monster monster = new Monster();
		monster.attackPower = 10;
		monster.health = 100;
		monster.showInfo();
		monster.attack();
		
		System.out.println();
		
		Slime slime = new Slime();
		slime.attackPower = 30;
		slime.health = 200;
		slime.skill = "마비";
		slime.showInfo();
		slime.attack();
		slime.castSkill();

	}

}
