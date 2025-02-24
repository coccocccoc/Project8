package inheritance.quiz;

//슬라임
public class Slime extends Monster {
	String skill; // 스킬
	
	public void castSkill() {
		System.out.println("몬스터가 " + skill + "를 시전했다!");
	}
}