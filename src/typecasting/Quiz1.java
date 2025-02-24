package typecasting;

public class Quiz1 {

	public static void main(String[] args) {
		
		Child child = new Child("한국", "고", "길동");
		System.out.println(child.nationality);
		System.out.println(child.lastName);
		System.out.println(child.firstName);
		
		// 형변환
		// 형변환의 규칙:
		// 부모타입의 변수 = 자식 인스턴스
		Parants pc = new Child("한국", "오", "아리");
		System.out.println(pc.nationality);
		System.out.println(pc.lastName);
		// 형변환된 변수는 부모가 물려준 속성만 사용할 수 있다
		// pc 변수는 이름(firstName)을 사용할 수 없다
		
	}

}


class Parants {
	String nationality; // 국적
	String lastName; // 성
	
	// 외부에서 입력받은 값으로 멤버변수를 초기화
	public Parants(String nationality, String lastName) {
		this.nationality = nationality; // 멤버 = 매개
		this.lastName = lastName; // 멤버 = 매개
	}
	
}

class Child extends Parants {
	String firstName; // 이름

	// 부모에게 물려받은 속성까지 포함하여
	// 모든 멤버변수를 초기화하는 생성자
	public Child(String nationality, String lastName, String firstName) {
		// Parants 클래스는 기본생성자가 없으므로
		// 모든 멤버변수를 입력받는 생성자를 사용할 것
		super(nationality, lastName);
		this.firstName = firstName;
	}
	
}