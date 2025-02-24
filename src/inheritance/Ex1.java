package inheritance;

public class Ex1 {

	public static void main(String[] args) {

		// 자식 인스턴스 생성
		Child child = new Child();
		child.nationality = "한국"; // 부모가 물려준 속성
		child.lastName = "고"; // 부모가 물려준 속성
		child.firstName = "길동"; // 자식 고유의 속성

	}

}

// 부모 클래스
class Parents {
	String nationality; // 국적
	String lastName; // 성
}

// 자식 클래스
// 클래스를 상속받는 방법:
// extends(키워드) + 부모 클래스의 이름
class Child extends Parents {
	String firstName; // 이름
}