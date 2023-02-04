package ch07;
import java.util.*;
public class HashMapDicEx {

	public static void main(String[] args) {

		//HashMap<String, String> dic = new HashMap<>();
		var dic = new HashMap<String, String>();
		
		dic.put("baby", "�Ʊ�");
		dic.put("love", "���");
		dic.put("apple", "���");
		
		//��� Ű�� ���� ���
		Set<String> keys = dic.keySet();	// ��� Ű�� Set �÷��ǿ� �޾ƿ�
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {  
			String key = it.next();
			String value = dic.get(key);
			System.out.println("(" + key + "," + value + ")");
		}
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<3;i++) {  
			System.out.print("ã�� �ܾ�>>");
			String eng = scanner.next();
			
			String kor = dic.get(eng);
			if(kor == null) System.out.println("���� �ܾ�");	//Ű�� �ش��ϴ� ���� ������ null�� ��ȯ
			else System.out.println(kor);
			
		scanner.close();
		}
	}

}
