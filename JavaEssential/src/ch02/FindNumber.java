package ch02;
import java.util.Scanner;
public class FindNumber {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("ö�� >> ");
	        String a = scanner.next();
	        System.out.print("���� >> ");
	        String b = scanner.next();

	        if(a.equals("����")){
	            if(b.equals("����")){System.out.println("���");}
	            else if(b.equals("����")){System.out.println("���� ��");}
	            else if(b.equals("��")){System.out.println("ö�� ��");}
	        }
	        else if(a.equals("����")){
	            if(b.equals("����")){System.out.println("ö�� ��");}
	            else if(b.equals("����")){System.out.println("���");}
	            else if(b.equals("��")){System.out.println("���� ��");}
	        }
	        else if(a.equals("��")){
	            if(b.equals("����")){System.out.println("���� ��");}
	            else if(b.equals("����")){System.out.println("ö�� ��");}
	            else if(b.equals("��")){System.out.println("���");}
	        }
	    }
	}