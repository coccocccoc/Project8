package typecasting;

public class Ex2 {

	public static void main(String[] args) {
		VIPCustomer2 vip = new VIPCustomer2("둘리");
		vip.showInfo();

	}

}

class Customer2 {

	String customerName;
	String customerGrade;
	double bonusPoint;
	double bonusRatio;
	
	public Customer2(String name) {
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
class VIPCustomer2 extends Customer2 {
	double saleRatio;
	
	// 회원의 이름을 초기화하는 생성자
	public VIPCustomer2(String name) {
		// 부모 클래스에 기본 생성자가 없기 때문에 에러가 남
		super(name); // Customer2
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.saleRatio = 0.1;
		System.out.println("VIPCustomer 생성자 호출");

	}
}