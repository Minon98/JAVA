package ch06.quiz;
import java.util.Scanner;
import java.lang.Math;
public class Q6_RSP {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		while(true) {  
			int com = (int)(Math.random()*3)+1;
			System.out.print("����(1) ����(2) ��(3) ������(4)>>");
			int user = scanner.nextInt();
			if(user == 4) {  
				System.out.println("��������");
				break;
			}
			switch (user) {
			case 1:{ //����ڰ� ���� �� ���
				System.out.print("����� ���� : ");
				if(com==1) {System.out.println("��ǻ�� ����\n�����ϴ�.");}
				else if(com==2) {System.out.println("��ǻ�� ����\n�����ϴ�.");}
				else {System.out.println("��ǻ�� ��\n�̰���ϴ�.");}
				break;
			}
			case 2:{//����ڰ� ���� �� ���
				System.out.print("����� ���� : ");
				if(com==2) {System.out.println("��ǻ�� ����\n�����ϴ�.");}
				else if(com==3) {System.out.println("��ǻ�� ��\n�����ϴ�.");}
				else {System.out.println("��ǻ�� ����\n�̰���ϴ�.");}
				break;
			}
			case 3:{ //����ڰ� ���� �� ���
				System.out.print("����� �� : ");
				if(com==3) {System.out.println("��ǻ�� ��\n�����ϴ�.");}
				else if(com==1) {System.out.println("��ǻ�� ����\n�����ϴ�.");}
				else {System.out.println("��ǻ�� �ָ�\n�̰���ϴ�.");}
				break;
			}
			}
		}
	}
}
