package ch07;
//���׸� ����
class GStack<T>{ //���׸� ���� ����, ���׸� Ÿ�� T 
	int tos;
	Object [] stck;
	public GStack() {  
		tos=0;
		stck = new Object[10];
	}
	public void push(T item) {  
		if(tos == 10) return;	//���� ���� ��
		stck[tos] = item;
		tos++;
	}
	@SuppressWarnings("unchecked")
	public T pop() {  
		if(tos==0) return null;	//���� ��
		tos--;
		return (T)stck[tos];	// !!Ÿ�� �Ű� ���� Ÿ������ ĳ����!!
	}
}
public class MyStack {

	public static void main(String[] args) {

		//GStack<String> stringStack = new GStack<String>();
		var stringStack = new GStack<String>();
		stringStack.push("seoul");
		stringStack.push("busan");
		stringStack.push("LA");
		
		for (int i = 0; i < 3; i++) {
			System.out.println(stringStack.pop());
		}
		
		var intStack = new GStack<Integer>();;
		intStack.push(1);
		intStack.push(3);
		intStack.push(5);
		
		for (int i = 0; i < 3; i++) {
			System.out.println(intStack.pop());			
		}
	}

}
