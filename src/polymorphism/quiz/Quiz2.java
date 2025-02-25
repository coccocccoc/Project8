package polymorphism.quiz;

import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {
		
		// 회원 리스트 생성
		ArrayList<Customer> list =  new ArrayList<Customer>();
		
		list.add(new Customer("둘리"));
		list.add(new GOLDCustomer("도우너"));
		list.add(new VIPCustomer("또치"));
		
		for(Customer customer : list) {
			customer.calcPrice(10000);
		}
		
		for (Customer customer : list) {
			customer.showInfo();
		}
		

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

// 골드 회원
class GOLDCustomer extends Customer {
	
	double saleRatio;

	public GOLDCustomer(String name) {
		super(name);
		this.customerGrade = "GOLD";
		this.bonusRatio = 0.02;
		this.saleRatio = 0.1;
	}

	@Override
	public void calcPrice(int price) {
		bonusPoint = bonusPoint + price * bonusRatio;
		double salePrice = price - price * saleRatio;
		System.out.println(customerName + "님이 " + salePrice + "원을 결제했습니다.");
	}
}