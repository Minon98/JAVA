package ch06.quiz;
import java.util.Scanner;
public class Bonus2_Modify {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {  
			System.out.print(">>");
			String s = scanner.nextLine();
			StringBuffer sb = new StringBuffer(s);
			if(sb.equals("exit")) {  
				System.out.println("exit..");
				break;
			}
			int index = (int)(Math.random()*s.length());	//������ ���� ��ġ ����
			while(true) {  
				int i = (int)(Math.random()*26); //���ĺ� �߿��� ����
				char c = (char)('a' + i);
				if(!(sb.equals(c))) {
					sb.replace(index, index+1, Character.toString(c));		//char�� String���� ��ȯ���ְ� replace�޼ҵ� ���
					break;
				}
			}
			System.out.println(sb);
		}
		scanner.close();
	}

}
