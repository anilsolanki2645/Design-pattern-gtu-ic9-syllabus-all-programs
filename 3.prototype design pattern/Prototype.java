
interface Student{
	Student getClone();
}

class Student_Detail implements Student{
	int Enroll;
	String name;
	String Class;
	String course;
	String mobile;
	int duration;
	
	Student_Detail(int Enroll, String name, String Class, String course, String mobile, int duration){
		this.Enroll = Enroll;
		this.name = name;
		this.Class = Class;
		this.course = course;
		this.mobile = mobile;
		this.duration = duration;
	}
	
	void display(){
		System.out.println("Student Enroll : "+Enroll);
		System.out.println("Student name : "+name);
		System.out.println("Student Class : "+Class);
		System.out.println("Student course : "+course);
		System.out.println("Student mobile : "+mobile);
		System.out.println("Student duration : "+duration);
	}
	
	public Student getClone(){
		return new Student_Detail(Enroll,name,Class,course,mobile,duration);
	}
}

public class Prototype{
	public static void main(String args[]){
		Student_Detail s = new Student_Detail(234,"Anil","IC9","IMCA","9558322778",5);
		s.display();
		System.out.println("\n\n");
		Student_Detail s1 =(Student_Detail)s.getClone();
		s1.display();
	}
}