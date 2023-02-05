package ch07.quiz;
import java.util.*;
public class Q6_CustomerPointMangement {

	public static void main(String[] args) {

		var pointManagement = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("-- ����Ʈ ���� ���α׷��Դϴ� --");
		while(true) {  
			System.out.print("�̸��� ����Ʈ �Է�>>");
			String name = scanner.next();
			int point = scanner.nextInt();
			if(name.equals("exit")) {  
				System.out.println("exit..");
				break;
			}
			else if(pointManagement.containsKey(name))
				pointManagement.put(name,pointManagement.get(name) + point);
			else 
				pointManagement.put(name, point);
			
			Set<String> key = pointManagement.keySet();
			Iterator<String> it = key.iterator();
			while(it.hasNext()) {  
				String key1 = it.next();
				Integer value = pointManagement.get(key1);
				System.out.print("("+key1+","+value+")");
			}
			System.out.println();
		}
		scanner.close();
	}
}