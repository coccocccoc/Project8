package typecasting;

public class Ex3 {

	public static void main(String[] args) {
		
		// 형변환 공식
		// customer 타입 변수 = VIPCustomer 인스턴스
		// 부모타입의 변수는 자식인스턴스를 저장할 수 있다
		Customer3 customer = new VIPCustomer3("둘리");
		
		// 형변환된 변수는 부모클래스가 물려준 속성만 사용할 수 있다
		// customer 변수는 VIP의 할인률을 사용할 수 없다(제약)
//		customer.

	}

}

class Customer3 {

	String customerName;
	String customerGrade;
	double bonusPoint;
	double bonusRatio;
	
	public Customer3(String name) {
		// 회원의 이름 초기화
		this.customerName = name;
		this.customerGrade = "SILVER";
		this.bonusRatio = 0.01;
		System.out.println("Customer(String) 생성자 호출");
	}
	
	public void calcPrice(int price) {
		bonusPoint = bonusPoint + price*bonusRatio;
		System.out.println(customerName + "님이 " + price + "원을 결제했습니다.");
	}
	
	public void showInfo() {
		System.out.println(customerName + "님의 등급은 " + customerGrade + "이며, 보너스포인트는 " + bonusPoint + "점 입니다.");
	}
	
}

// VIP 회원
class VIPCustomer3 extends Customer3 {
	double saleRatio;
	
	// 회원의 이름을 초기화하는 생성자
	public VIPCustomer3(String name) {
		// 부모 클래스에 기본 생성자가 없기 때문에 에러가 남
		super(name); // Customer2
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.saleRatio = 0.1;
		System.out.println("VIPCustomer 생성자 호출");

	}
}