package polymorphism;

public class Ex2 {

	public static void main(String[] args) {
		
		Customer customer1= new Customer("둘리");
		customer1.calcPrice(10000);
		customer1.showInfo();
		
		// 부모타입으로 형변환
		Customer customer2 = new VIPCustomer("또치");
		customer2.calcPrice(10000);
		customer2.showInfo();

		// 같은 코드를 써도 다른 결과가 출력됨
		// 둘 다 Customer 타입의 참조변수를 사용했지만
		// 실제 인스턴스에 따라 결과가 출력된다
	}
}

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

	@Override
	public void calcPrice(int price) {
		bonusPoint = bonusPoint + price * bonusRatio; // 적립
		double salePrice = price - price * saleRatio; // 할인가
		System.out.println(customerName + "님이 " + salePrice + "원을 결제했습니다.");
	}

}