package inheritance;

public class Ex3 {

	public static void main(String[] args) {
		
		// 일반 회원 생성
		Customer customer =  new Customer();
		customer.customerName = "둘리";
		customer.calcPrice(10000); // 만원짜리 물건 구매
		customer.showInfo();
		
		// VIP 회원 생성
		VIPCustomer vip = new VIPCustomer();
		vip.customerName = "또치";
		vip.calcPrice(10000);
		vip.showInfo();
		// 5% 적립은 됐지만 10% 할인을 못받음
		// 부모의 메소드를 그대로

	}

}

// 일반회원
class Customer {

	String customerName; // 고객 이름
	String customerGrade; // 고객 등급
	double bonusPoint; // 보너스 포인트
	double bonusRatio; // 적립률
	
	// 생성자의 목적:
	// 1. 인스턴스 생성
	// 2. 멤버변수 초기화
	public Customer() {
		// 등급과 적립률은 모든 사람이 같은 값을 가져가므로 고정
		this.customerGrade = "SILVER";
		this.bonusRatio = 0.01; // 1%
	}
	
	// 쇼핑몰의 제품을 구매하는 메소드
	// 가격을 지불하고 보너스 포인트를 적립
	// 리턴값 x, 매개변수 o
	public void calcPrice(int price) {
		// 기존 포인트 + 물건가격 * 1%
		bonusPoint = bonusPoint + price*bonusRatio;
		System.out.println(customerName + "님이 " + price + "원을 결제했습니다.");
	}
	
	public void showInfo() {
		System.out.println(customerName + "님의 등급은 " + customerGrade + "이며, 보너스포인트는 " + bonusPoint + "점 입니다.");
	}
	
}

// VIP 회원
// 일반회원의 기본정보를 물려받아 총 5개의 속성을 가지고 있음
// 일반회원의 기능을 물려받아서 총 2개의 기능을 가지고 있음 (calcPrice(), showInfo())
class VIPCustomer extends Customer {
	double saleRatio; // 할인률
	
	public VIPCustomer() {
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.saleRatio = 0.1;
	}
}