package ch06;
import java.util.Scanner;
public class Bonus3_StringRotateOnEnter {

	public static void main(String[] args) {

		System.out.println("���ڿ��� �Է��ϼ���. �� ĭ�� �־ �ǰ� ���� �ѱ� ��� ����.");
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		
		System.out.println("<Enter>Ű�� �Է��ϸ� ���ڿ��� �� ���ھ� ȸ���մϴ�.");
		
		while(true){  
			String key = scanner.nextLine();
			if(key.equals("")) {	//���͸� �Էµ� ���
				String first = text.substring(0, 1);
				String last = text.substring(1);
				text = last.concat(first);
				System.out.println(text + ">>");
			}
			else if(key.equals("q")) {  
				break;
			}
			else {
				System.out.print(text+">>");
			}
		}
		System.out.println("exit..");
		scanner.close();
	}

}
