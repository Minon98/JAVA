package ch07.quiz;
import java.util.*;
public class Q4_GrowthTable {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		var table = new Vector<Integer>();
		
		System.out.println("2000~2009����� 1�� ������ Ű(cm)�� �Է�");
		for (int i = 0; i < 10; i++) {
			table.add(scanner.nextInt());
		}

		double max=0;;
		int year=0;
		for (int i = 0; i < 9; i++) {
			if(max < table.get(i+1) - table.get(i)) {
				max=table.get(i+1) - table.get(i);
				year = i;
			}
		}
		System.out.println("���� Ű�� ���� �ڶ� �⵵�� " + (2000+year) + "�� " + max + "cm");
		scanner.close();
	}

}
