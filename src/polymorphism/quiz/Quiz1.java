package polymorphism.quiz;

public class Quiz1 {

	public static void main(String[] args) {
		
		runCar(new Bus()); // Car car = new Bus();
		runCar(new SportsCar()); // Car car = new SpotrsCar();

		
	}
	
	// 매개변수를 부모타입으로 선언: Bus SportsCar
	public static void runCar(Car car) {
		car.runCar(); // 실제 인스턴스의 함수가 호출됨
	}
}

class Car {
	public void runCar() {
		System.out.println("차가 달린다");
	}
}

class Bus extends Car {
	@Override
	public void runCar() {
		System.out.println("버스가 달린다");
	}
}

class SportsCar extends Car {
	@Override
	public void runCar() {
		System.out.println("스포츠카가 달린다");
	}
}