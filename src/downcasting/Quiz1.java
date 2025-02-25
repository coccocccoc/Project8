package downcasting;

import java.util.ArrayList;

public class Quiz1 {

	public static void main(String[] args) {
		
		ArrayList<Animal> list = new ArrayList<Animal>();
		
		list.add(new Human());
		list.add(new Tiger());
		list.add(new Eagle());
		
		for(Animal animal : list) {
			if(animal instanceof Human) {
				Human human = (Human) animal; // 다운캐스팅
				human.readBook(); // 실제 인스턴스가 가지고 있는 함수 사용
			} else if (animal instanceof Tiger) {
				Tiger tiger = (Tiger) animal;
				tiger.hunting();
			} else if (animal instanceof Eagle) {
				Eagle eagle = (Eagle) animal;
				eagle.flying();
			}
		}

	}
}
