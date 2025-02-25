package polymorphism;

import java.util.ArrayList;

// 다형성을 활용하여 쇼핑몰 관리 프로그램 구현하기
public class Ex4 {

	public static void main(String[] args) {
		
		// 회원 리스트 생성
		// <E>: 리스트 안에 담을 데이터의 타입
		// 회원의 종류? Customer VIPCustomer
		// 부모인 Customer로 설정해야 둘 다 담을 수 있음
		ArrayList<Customer> list = new ArrayList<Customer>();

		list.add(new Customer("둘리"));
		list.add(new Customer("또치"));
		list.add(new Customer("도우너"));
		list.add(new VIPCustomer("마이콜"));
		list.add(new VIPCustomer("고길동"));
		
		// 모든 회원이 10000원짜리 물건을 구매
		for(Customer customer : list) {
			customer.calcPrice(10000);
		}
		for (Customer customer : list) {
			customer.showInfo();
		}
	}
}
