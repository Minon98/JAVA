package ch07.quiz;
import java.util.*;

class Word{
	String eng, kor;
	public Word(String eng, String kor){  
		this.eng=eng; this.kor=kor;
	}
	public String getEng() {return eng;}
	public String getKor() {return kor;}
}

public class OP_WordQuiz {
	Vector<Word> v = new Vector<Word>();	//point vector
	Scanner scanner = new Scanner(System.in);
	Random rand = new Random();
	int[] quizs = new int[4];
	
	public OP_WordQuiz() {  
		setVector();
		System.out.println("���� ���� �׽�Ʈ�� �����մϴ�. 1~4 �� �ٸ� �Է½� �����մϴ�.");
		System.out.println("����" + v.size() + "�� �ܾ �ֽ��ϴ�.");
		game();
	}
	public void game() {  
		while(true) {  
			setQuiz();
			int answer = rand.nextInt(4); 
			int answerIndex = quizs[answer];	//�迭�� ������ ���伱��
			System.out.println(v.get(answerIndex).getEng()+"?");
			
			for (int i = 0; i < quizs.length; i++) {
				System.out.print("(" + (i+1) + ") ");
				System.out.print(v.get(quizs[i]).getKor() + " ");
			}
			System.out.print(">> ");
			
			int choice = scanner.nextInt();
			if(choice-1 == answer) {  
				System.out.println("Excellent !!");
			}
			else if(choice>0 && choice<5 && choice != answer) {  
				System.out.println("no. !!");
			}
			else {
				return;
			}
		}
	}
	
	public void setQuiz() {  
		for(int i=0; i<4; i++) {  
			quizs[i] = rand.nextInt(v.size());
			for (int j = 0; j < i; j++) {
				if(quizs[i] == quizs[j]) {	//�ߺ��ǰ� ������ �ٽ�
					i--;
					continue;
				}
			}
		}
	}
	
	public void setVector() {  
		v.add(new Word("culture", "��ȭ"));
		v.add(new Word("experience", "����"));
		v.add(new Word("education", "����"));
		v.add(new Word("symbol", "��¡"));
		v.add(new Word("effect", "���"));
		v.add(new Word("liberty", "����"));
		v.add(new Word("affair", "���"));
		v.add(new Word("comfort", "�ȶ�"));
		v.add(new Word("tradition", "����"));
		v.add(new Word("subject", "����"));
	}
	
	public static void main(String[] args) {
		new OP_WordQuiz();
	}
}
