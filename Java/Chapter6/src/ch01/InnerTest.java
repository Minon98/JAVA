package ch01;

class OutClass{
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass(){
		inClass = new InClass();
	}
	
	
	class InClass{
		int iNum = 100;
		
//		static int sInNum = 500;   �Ұ���
		
		void inTest() {
			System.out.println("OutClass num = " + num + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass iNum = " + iNum + "(���� Ŭ������ �ν��Ͻ� ����)");
		}
	}
	
	public void usingClass() {
		inClass.inTest();
	}
	
	static class InStaticClass{
		
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
//			System.out.println("OutClass num = " + num + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("InStaticClass inNum = " + inNum + "(���� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InStaticClass sINnum = " + sInNum + "(���� Ŭ������ ����ƽ ����)");
		}
		
		static void sTest() {
//			num += 10;		�ܺ� Ŭ���� �ν���Ʈ ���� �Ұ�
//			inNum += 10;	���� Ŭ���� �ν���Ʈ ���� �Ұ�
			
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InStaticClass sINnum = " + sInNum + "(���� Ŭ������ ����ƽ ����)");
		}
	}
}



public class InnerTest {
	
	public static void main(String[] args) {
		/*
		OutClass outClass = new OutClass();
		outClass.usingClass();
		
		OutClass.InClass inner = outClass.new InClass();
		inner.inTest();
		*/
		//�ܺ� Ŭ���� �������� �ʰ� �ٷ� ���� ���� Ŭ���� ����
				OutClass.InStaticClass sInClass = new OutClass.InStaticClass();  
				System.out.println("���� ���� Ŭ���� �Ϲ� �޼��� ȣ��");
				sInClass.inTest();
				System.out.println();
				
				System.out.println("���� ���� Ŭ������ ����ƽ �޼ҵ� ȣ��");
				OutClass.InStaticClass.sTest();

	}

}
