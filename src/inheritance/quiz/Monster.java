package inheritance.quiz;

//몬스터
public class Monster {
	int attackPower;
	int health;
	
	public void attack() {
		System.out.println("몬스터가 " + attackPower + "만큼 공격했다!");
	}
	
	public void showInfo() {
		System.out.println("몬스터의 공격력은 " + attackPower + "이고, 체력은 " + health + "이다." );
	}
}
