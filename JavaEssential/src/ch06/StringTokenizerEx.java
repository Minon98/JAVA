package ch06;
import java.util.StringTokenizer;
public class StringTokenizerEx {

	public static void main(String[] args) {
		//stringbuffer
		//���ο� ���� ũ���� ���۸� ������ �ڵ� �����Ѵ�.
		//��Ʈ���� ������ ����
		StringBuffer sb = new StringBuffer("This");
		sb.append(" is pencil");
		System.out.println(sb);
		sb.insert(7, " my");
		System.out.println(sb);
		sb.replace(8, 10, "your");
		System.out.println(sb);
		
		String query = "name=minyong&addr=seoul&age=26";
		StringTokenizer st = new StringTokenizer(query, "&");
		
		int n = st.countTokens();	//�и��� ��ū ����
		System.out.println("��ū ���� = " +n);
		while(st.hasMoreTokens()) {  			//for(int i=0; i<n; i++)�� ����
			String token = st.nextToken();
			System.out.println(token);
		}
		
		
	}

}
