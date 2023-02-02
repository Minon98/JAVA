// �ڹٴ� ���̽�ó�� �迭�� ��ũ�� �Ǿ����� �ʾ� �Ϻ��ϰ� �������� �ʾҴ�.

package ch05;
import java.util.Scanner;
abstract class Shape{  
	abstract void draw();
}

class Editor extends Shape{  
	Scanner scanner = new Scanner(System.in);
	static int i =0;
	private String[] Shape = new String[10];
	
	public void insert() { 
		System.out.print("���� ���� Line(1), Rect(2), Circle(3) >>");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			Shape[i] = "Line";
			i++;
			break;
		case 2:
			Shape[i] = "Rect";
			i++;
			break;
		case 3:
			Shape[i] = "Circle";
			i++;
			break;
		default:
			break;
		}
	}
	public void delete() {  
		System.out.print("������ ������ ��ġ>>");
		int loc = scanner.nextInt();
		if(loc > i) {
			System.out.println("������ �� �����ϴ�.");
		}
		else {
			Shape[loc-1] = null;
		}
	}
	public void draw() { 
		for(int j=0; j<i; j++) {  
			System.out.println(Shape[j]);
		}
	}
}
public class Q6_GraphicEditor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Editor e = new Editor();
		
		while(true) {  
			System.out.print("����(1), ����(2), ��� ����(3), ����(4)>>");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				e.insert();
				break;
			case 2:
				e.delete();
				break;
			case 3:
				e.draw();
				 break;
			case 4:
				System.out.print("�����մϴ�.");
				System.exit(0);
			default:
				break;
			}
		}
	}

}
