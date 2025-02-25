package downcasting;

import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {
		
		ArrayList<Person> list = new ArrayList<Person>();

		list.add(new Student("둘리"));
		list.add(new Employee("또치"));

		for(Person person : list) {
			person.eat(); // 자식들의 공통기능은 부모타입의 변수를 사용
			
			if(person instanceof Student) {
				Student student = (Student) person; // 다운캐스팅
				student.study();
			} else if (person instanceof Employee) {
				Employee employee = (Employee) person;
				employee.work();
			} 
		}
	}
}


class Person { 
	String name;
	public Person(String name) {
		super();
		this.name = name;
	}
	public void eat() {
		System.out.println(name + "가 밥을 먹는다");
	}
}

class Student extends Person { // 상속받을 때 에러남
	public Student(String name) {
		super(name);
	}
	public void study() {
		System.out.println(name + " 학생이 공부를 한다");
	}
}

class Employee extends Person {
	public Employee(String name) {
		super(name);
	}
	public void work() {
		System.out.println(name + " 회사원이 일을 한다");
	}
}
