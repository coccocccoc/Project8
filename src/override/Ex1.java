package override;

public class Ex1 {

	public static void main(String[] args) {

		// 일반 회원 생성
		Customer customer = new Customer("둘리");
		customer.calcPrice(10000); // 10000원짜리 물건 구매
		customer.showInfo();

		// VIP 회원 생성
		VIPCustomer vipCustomer = new VIPCustomer("또치");
		// calcPrice는 VIP에서 재정의한 함수를 사용함
		vipCustomer.calcPrice(10000); // 10000원짜리 물건 구매
		vipCustomer.showInfo();

		// VIP는 10퍼센트를 할인받아 9000원에 결제
	}

}

// 일반 회원
class Customer {

	String customerName;
	String customerGrade;
	double bonusPoint;
	double bonusRatio;

	public Customer(String name) {
		this.customerName = name;
		this.customerGrade = "SILVER";
		this.bonusRatio = 0.01;
	}

	// 물건을 구매하는 메소드
	public void calcPrice(int price) {
		bonusPoint = bonusPoint + price * bonusRatio;
		// 일반회원은 물건의 정가를 그대로 지불한다
		System.out.println(customerName + "님이 " + price + "원을 결제했습니다.");
	}

	public void showInfo() {
		System.out.println(customerName + "님의 등급은 " + customerGrade + "이며, 보너스포인트는 " + bonusPoint + "점 입니다.");
	}

}

// VIP 회원
class VIPCustomer extends Customer {

	double saleRatio;

	public VIPCustomer(String name) {
		super(name);
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.saleRatio = 0.1;
	}

	// 메소드 재정의
	// Source -> Override
	// VIP는 물건 가격의 10%를 할인받는다

	// 오버라이드란?
	// 부모가 물려준 메소드를 재정의 하는 것
	// 조건: 부모의 메소드와 선언부(중괄호 앞부분)가 같고, 블록내부는 달라도 됨
	@Override
	public void calcPrice(int price) {
		bonusPoint = bonusPoint + price * bonusRatio; // 적립
		double salePrice = price - price * saleRatio; // 할인가
		System.out.println(customerName + "님이 " + salePrice + "원을 결제했습니다.");
	}

}