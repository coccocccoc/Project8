package override;

public class Ex2 {

	public static void main(String[] args) {

		// 형변환
		Customer vc = new VIPCustomer("둘리");
		vc.calcPrice(10000); // 형변환된 변수로 물건 구매한다면?

		// 프로그램이 동작할 때(런타임시)
		// 어떤 calcPrice 함수를 사용할지 결정한다

		// 10000원? 9000원?
		// 형변환된 변수는 자식의 오버라이드된 메소드를 호출함
		// (할인된 가격으로 결제가 됨)
		// 형변환된 변수는 부모의 것만 사용할 수 있지만
		// => 오버라이드 메소드는 예외

	}

}
