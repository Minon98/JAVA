package test4;

import java.util.Scanner;

public class PhoneApp {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
         
        PhoneNum [] contact =new PhoneNum[10];      // contact(����ó) �迭 ����
        
        int count = 0;                        // ����� ����ó ����
        for(int i=0; i<contact.length; i++){
            System.out.print("�̸�:");
            String name = scanner.nextLine();
            if(name.equals("�׸�"))               // '�׸�' �Է½� �ݺ� �ߴ�
               break;
            else {
            System.out.print("��ȭ��ȣ: ");
            String tel = scanner.nextLine();
            contact[i] =new PhoneNum(name, tel);   // �迭 ���� ��ü ����
            count++;
            }
        }
        System.out.println(count + "���� ����ó�� ����Ǿ����ϴ�!");
        

        System.out.print("�˻��� �̸�: ");
        while(true) {
        String search = scanner.nextLine();
        if(search.equals("exit"))					//exit�Է½� ����
        	break;
        ///////////////////////////////////////////// �迭 �˻�

        }

    }
}