package inheritance.quiz;

public class Quiz1 {
	public static void main(String[] args) {

		Tiger tiger = new Tiger();
		tiger.leg = 4; // 부모 클래스에서 물려받은 속성
		tiger.tail = 1;

		Eagle eagle = new Eagle();
		eagle.leg = 2; // 부모 클래스에서 물려받은 속성
		eagle.wings = 2;

	}
}

// 속성 = 멤버변수, 기능 = 메소드
// 동물 클래스
class Animal {
	int leg; // 다리
}

// 호랑이와 독수리는 동물의 자식이다

// 호랑이 클래스
class Tiger extends Animal {
	int tail; // 꼬리
}

// 독수리 클래스
class Eagle extends Animal {
	int wings; // 날개
}