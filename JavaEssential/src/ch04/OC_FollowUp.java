package ch04;
import java.util.InputMismatchException;		//���� ó�� �߰�
import java.util.Scanner;

class Player{ 
	String userNameString;
	String wordString;
	
	void getWordFromUser() {
		Scanner scanner = new Scanner(System.in);
		System.out.print(userNameString+">>");
		String wordString = scanner.next();
		
		this.wordString = wordString;
	}
	
	boolean checkSuccess(String lastWordString) { //���� �ձ� �Ǻ���
		int lastIndexInt = lastWordString.length()-1; //������ ������ �ε���
		char lastChar = lastWordString.charAt(lastIndexInt); //������ ����
		char firstChar = wordString.charAt(0); //ù��° ����
		
		if(lastChar == firstChar) return true;	//�Ǻ�
		else return false;
	}
}
public class OC_FollowUp {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void run() {  //���� ����    ������ �迭ȭ 
		System.out.print("�����ο���>>");
		int userNumInt = scanner.nextInt();
		
		Player[] player = new Player[userNumInt];
		
		for(int i=0; i<userNumInt; i++) {
			System.out.print("user name>>");
			String userNameString = scanner.next();
			player[i] = new Player();
			player[i].userNameString = userNameString;
		}
		System.out.println("���� �ܾ�� '�ƹ���'");
		
		String lastwordsString = "�ƹ���";
		int i = 0;
		
		while(true) {  
			player[i].getWordFromUser(); // ������ �ܾ�
			
			if(!(player[i].checkSuccess(lastwordsString))) {	//�й�
				System.out.println(player[i].userNameString+"�� �й�");
				break;
			}
			
			lastwordsString = player[i].wordString;
			
			i++;	//���� ����
			if(i==userNumInt) i = 0;	//������ ������ ó���ο�
		}
	}
	
	public static void main(String[] args) {
		System.out.println("start game");
		
		while(true) {
			try {
				run();
				
				while(true) {  // restart �߰�
					System.out.print("restart?(y/n)>>");
					String restartString = scanner.next();
					
					if(restartString.equals("y")) {  
						System.out.println("restart!");
						break;
					}
					else if(restartString.equals("n")) {  
						System.out.println("exit");
						System.exit(0);
					}
					else System.out.println("wrong input");
					continue;
					
				}
			} catch (InputMismatchException e) {
				System.out.println("wrong input");
				scanner.nextLine();
				continue;
			}
		}
	}
}
