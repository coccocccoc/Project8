package inheritance;

public class Ex2 {

	public static void main(String[] args) {
		
		// 학생 생성
		Student student = new Student();
		student.sound();
		student.eat();
		student.study();

		// 교수 생성
		Professor professor = new Professor();
		professor.sound();
		professor.eat();
		professor.work();
		
		// 상속의 목적:
		// 1. 자식들이 부모의 특징을 물려받는 것
		// 2. 속성 또는 기능을 간단하게 추가
	}

}

// 사람 클래스 (부모)
class Person {
	
	public void sound() {
		System.out.println("대화를 한다");
	}
	
	public void eat() {
		System.out.println("식사를 한다");
	}
}

// 학생 클래스 (자식)
class Student extends Person {
	public void study() {
		System.out.println("학생이 공부를 한다");
	}
}

// 교수 클래스 (부모)
// Person 클래스를 상속받으면
// Person이 가지고 있는 sound() eat()을 물려받는다
class Professor extends Person {
	public void work() {
		System.out.println("교수가 수업을 한다");
	}
}