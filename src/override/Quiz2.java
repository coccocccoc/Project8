package override;

public class Quiz2 {

	public static void main(String[] args) {

		Coffee coffee1 = new Coffee();
		coffee1.taste();
		
		Coffee coffee2 = new Americano();
		coffee2.taste();
		
		Coffee coffee3 = new CafeLatte();
		coffee3.taste();

		// 프로그램을 실행하기 전에는 부모클래스의 함수를 가리킨다
		// 프로그램이 실행될때는(런타임) 자식클래스의 함수를 가리킨다
		// 프로그램이 실행될때 실제로 실행될 함수를 선택한다
	}

}

class Coffee {
	public void taste() {
		System.out.println("커피를 마신다");
	}
}

class Americano extends Coffee {

	@Override
	public void taste() {
		System.out.println("아메리카노를 마신다");
	}

}

class CafeLatte extends Coffee {

	@Override
	public void taste() {
		System.out.println("카페라떼를 마신다");
	}

}