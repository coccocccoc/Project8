package typecasting;

public class Ex1 {

	public static void main(String[] args) {
		
		// VIP 회원 생성
		VIPCustomer vipCustomer = new VIPCustomer();
		
		// 부모 클래스의 생성자가 호출될 때, 이름/등급/포인트/적립률 속성이 생성 됨
		// 자식 클래스의 생성자가 호출될 때, 할인률 속성이 생성 됨
		// 따라서 VIP는 총 5개의 속성을 가지게 됨
	}

}


// 일반 회원
class Customer {

	String customerName;
	String customerGrade;
	double bonusPoint;
	double bonusRatio;
	
	public Customer() {
		this.customerGrade = "SILVER";
		this.bonusRatio = 0.01;
		System.out.println("Customer 생성자 호출");
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
class VIPCustomer extends Customer {
	double saleRatio;
	
	public VIPCustomer() {
		// super는 부모를 가리키는 키워드이다
		// super(); 는 생략할 수 있다 (없으면 컴파일러가 자동으로 생성함)
//		super(); // 부모의 생성자를 호출
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.saleRatio = 0.1;
		System.out.println("VIPCustomer 생성자 호출");
		
//		super();
		// super(); 코드는 생성자의 첫번째 졸에만 작성 가능
	}
}