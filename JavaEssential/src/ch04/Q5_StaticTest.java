package ch04;

class Circle{  
	private int radius;
	public Circle(int radius) {this.radius = radius;}
	public int getRadius() {return this.radius;}
	public void setRadius(int radius) {this.radius = radius;}
}

class CircleManager{	//static �޼ҵ常 ����
	static void copy(Circle src, Circle dest) {	//src�� dest�� ����
		dest.setRadius(src.getRadius()); 		//src�� �������� dest�� ����
	}
	static boolean equals(Circle a, Circle b) { //a�� b�� �������� ������ retrun true
		if(a.getRadius()==b.getRadius()) return true;
		else return false;
	}
}

public class Q5_StaticTest {

	public static void main(String[] args) {
		Circle pizaa = new Circle(5);
		Circle waffle = new Circle(1);
		
		boolean res = CircleManager.equals(pizaa, waffle);
			if(res == true)
				System.out.println("same size");
			else
				System.out.println("diff size");
			
		CircleManager.copy(pizaa, waffle);
		res = CircleManager.equals(pizaa, waffle);
			if(res == true)
				System.out.println("same size");
			else
				System.out.println("diff size");
	}
}
