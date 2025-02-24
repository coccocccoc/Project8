package override;

public class Quiz1 {

	public static void main(String[] args) {

		Cat cat = new Cat();
		Dog dog = new Dog();
		
		cat.eat();
		cat.sound();
		dog.eat();
		dog.sound();

	}

}

class Animal {

	public void eat() {
		System.out.println("먹는다");
	}

	public void sound() {
		System.out.println("짖는다");
	}
}

// 동물 클래스를 상속받아서 eat(), sound() 메소드를 물려받음
// 부모가 물려준 기능이 자식과 맞지 않을 때는 메소드를 재정의한다
class Cat extends Animal {

	@Override
	public void eat() {
		System.out.println("고양이는 쥐를 먹는다");
	}

	@Override
	public void sound() {
		System.out.println("고양이는 야옹하고 짖는다");
	}
}

class Dog extends Animal {

	@Override
	public void eat() {
		System.out.println("개는 고기를 먹는다");
	}

	@Override
	public void sound() {
		System.out.println("개는 멍멍하고 짖는다");
	}

}