package downcasting;

public class Ex1 {

	public static void main(String[] args) {

		// 형변환
		Animal animal = new Human();
		// 형변환된 변수로는 readBook()을 사용할 수 없다
		// 다시 readBook을 사용하려면 원래 타입으로 다운캐스팅 해야함

		// instanceof: 변수가 가리키는 인스턴스의 타입을 확인하는 연산자
		// animal이 가리키는 인스턴스 타입이 Human이 맞으면 true
		if (animal instanceof Human) { // true
			// 원래 타입의 변수 = 변환하고 싶은 변수
			Human human = (Human) animal; // 복제의 개념(?)
			human.readBook();
			
			// 타입을 확인해야 하는 이유:
			// Human Tiger Eagle 은 모두 Animal 의 자식이므로
			// 컴파일시에는 문제가 없다
			
			// 컴파일 오류 vs 런타임 오류
			// 런타임 오류는 프로그램이 비정상적으로 종료되기 때문에
			// 발생하지 않도록 처리해야 한다
		}

	}

}

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다");
	}
}

class Human extends Animal {

	@Override
	public void move() {
		System.out.println("사람이 두발로 걷습니다");
	}

	public void readBook() {
		System.out.println("사람이 책을 읽습니다");
	}
}

class Tiger extends Animal {

	@Override
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다");
	}

	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다");

	}
}

class Eagle extends Animal {

	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다");
	}

	public void flying() {
		System.out.println("독수리가 날개를 펴고 납니다");
	}
}