package ch03;

public class Q7_369 {

	public static void main(String[] args) {

		for(int i=0; i<100; i++) {
			int tenInt = i / 10;
			int firInt = i % 10;
			
			if(firInt != 0 && firInt%3 == 0) {
				if(tenInt !=0 && tenInt%3 == 0) {
					System.out.println(i+" �ڼ� �ι�");
				}
				else {
					System.out.println(i+" �ڼ� �ѹ�");
				}
			}
			else if(tenInt !=0 && tenInt%3 == 0) {
				System.out.println(i+" �ڼ� �ѹ�");
			}
		}
	}

}
