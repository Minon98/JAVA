package ch03;
import java.util.Scanner;
public class Q6_Dictionary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String eng[] = {"student", "love", "java", "happy", "future"};
		String kor[] = {"�л�", "���", "�ڹ�", "�ູ", "�̷�"};
		
		while(true) {
			int notExistInt = 0;
			System.out.println("���� �ܾ �Է�>>");
			String origineString = scanner.next();
			
			if(origineString.equals("exit")) {System.out.println("�����մϴ�.."); break;
			}
			
			for(int i=0; i<eng.length;i++) {
				if(eng[i].equals(origineString)) {
					System.out.println(kor[i]);
					notExistInt = 1;
				}
			}
			if(notExistInt == 0) {System.out.println("not exist word");
			}
		}
		scanner.close();
	}
}
