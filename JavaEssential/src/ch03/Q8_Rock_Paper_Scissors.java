package ch03;
import java.lang.Math;
import java.util.Scanner;
public class Q8_Rock_Paper_Scissors {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String cpuStrArr[] = {"����", "����", "��"};
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		
		while(true) {
			int n = (int)(Math.random()*3); //0,1,2
			System.out.print("���� ���� ��! >>");
			String userString = scanner.next();
			
			if(userString.equals("�׸�")) {
				System.out.println("quit...");
				break;
			}
			else if(cpuStrArr[n].equals("����")) {
				if(userString.equals("����")) {
					System.out.println("user = "+ userString + "cpu = " + cpuStrArr[n] + "���");continue;
				}
				else if(userString.equals("����")) {
					System.out.println("user = "+ userString + "cpu = " + cpuStrArr[n] + "�̱�");continue;
				}
				else if(userString.equals("��")) {
					System.out.println("user = "+ userString + "cpu = " + cpuStrArr[n] + "��");continue;
				}
			}
			
			else if(cpuStrArr[n].equals("����")) {
				if(userString.equals("����")) {
					System.out.println("user = "+ userString + "cpu = " + cpuStrArr[n] + "��");continue;
				}
				else if(userString.equals("����")) {
					System.out.println("user = "+ userString + "cpu = " + cpuStrArr[n] + "���");continue;
				}
				else if(userString.equals("��")) {
					System.out.println("user = "+ userString + "cpu = " + cpuStrArr[n] + "�̱�");continue;
				}
			}
			
			else if(cpuStrArr[n].equals("��")) {
				if(userString.equals("����")) {
					System.out.println("user = "+ userString + "cpu = " + cpuStrArr[n] + "�̱�");continue;
				}
				else if(userString.equals("����")) {
					System.out.println("user = "+ userString + "cpu = " + cpuStrArr[n] + "��");continue;
				}
				else if(userString.equals("��")) {
					System.out.println("user = "+ userString + "cpu = " + cpuStrArr[n] + "���");continue;
				}
			}
		}
		scanner.close();
	}

}
