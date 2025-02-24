package inheritance.quiz;

public class Quiz3 {

	public static void main(String[] args) {
		
		Ballpen ballpen = new Ballpen();
		ballpen.thickness = 2;
		ballpen.inkLevel = 1.0; // 100%
		ballpen.color = "파란색";
		
		FountainPen fountainPen = new FountainPen();
		fountainPen.thickness = 3; 
		fountainPen.inkLevel = 0.8; // 80%
		fountainPen.brand = "몽블랑";

	}

}

class Pen {
	int thickness;
	double inkLevel;
	
}

class Ballpen extends Pen {
	String color;
}

class FountainPen extends Pen {
	String brand;
}

