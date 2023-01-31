package school;

import java.util.ArrayList;

public class School {

	private static School instace = new School();		//�ν��Ͻ� �Լ�
	
	private static String SCHOOL_NAME = "Good School";
	private ArrayList<Student> studentList = new ArrayList<>();
	private ArrayList<Subject> subjectList = new ArrayList<>();
	
	private School() {}
	
	public static School getInstance() {
		if(instace == null)
			instace = new School();
		return instace;
	}

	//////////////////////////////////////get
	
	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public ArrayList<Subject> getSubjectList() {
		return subjectList;
	}
	
	/////////////////////////////////////set
	
	public void addStudent(Student student) {
		studentList.add(student);
	}
	
	public void addSubject(Subject subject) {
		subjectList.add(subject);
	}
	
	////////////////////////////////////
	
	public void setSubjectList(ArrayList<Subject> subjectList) {
		this.subjectList = subjectList;
	}
}
