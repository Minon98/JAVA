package ch07.quiz;
import java.util.*;
public class Q3_OrderCoffee {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		var coffees = new HashMap<String, Integer>();
		
		coffees.put("����������", 2000);
		coffees.put("�Ƹ޸�ī��", 2500);
		coffees.put("ī���", 3500);
		coffees.put("īǪġ��", 3000);
		
		System.out.println("����������, �Ƹ޸�ī��, īǪġ��, ī��� �ֽ��ϴ�.");
		while(true) {  
			System.out.print("�ֹ� >> ");
			String order = scanner.next();
			if(order.equals("�׸�")) break;
			System.out.println(order + "�� " + coffees.get(order) + "�Դϴ�.");
		}
	}

}
