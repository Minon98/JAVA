package test3;

import java.util.Scanner;

public class Location {

   public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      
      
      System.out.print("x ��ǥ�� �Է��ϼ���: ");	//x��ǥ �Է�
      int x = scanner.nextInt();
      System.out.print("y ��ǥ�� �Է��ϼ���: "); //y��ǥ �Է�
      int y = scanner.nextInt();

      
      if(x>=100 && x<=300) {      //x��ǥ�� 100~300 ��ǥ ��
         if(y>=100 && y<=300) {   //x��ǥ�� 100~300 ��ǥ ���̸�, y��ǥ�� 100~300 ��ǥ ���϶�
            System.out.println("�� (" + x + ", " + y + ")�� (100, 100)~(300, 300) ������ �簢�� ���� ��ġ�� �ֽ��ϴ�.");
         }
         else               //y��ǥ�� 100~300 ��ǥ ��
            System.out.println("�� (" + x + ", " + y + ")�� (100, 100)~(300, 300) ������ �簢�� �ۿ� ��ġ�� �ֽ��ϴ�.");
      }
      else                  //x��ǥ�� 100~300 ��ǥ ��
         System.out.println("�� (" + x + ", " + y + ")�� (100, 100)~(300, 300) ������ �簢�� �ۿ� ��ġ�� �ֽ��ϴ�.");
   }
}