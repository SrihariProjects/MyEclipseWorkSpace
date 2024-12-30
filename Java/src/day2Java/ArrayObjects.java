package day2Java;

class Student{
	int rollno;
	String name;
	int marks;
	
}
public class ArrayObjects {

	public static void main(String[] args) {

		Student s1=new Student();
		s1.rollno=2;
		s1.name="harsh";
		s1.marks=70;
		
		Student s2=new Student();
		s2.rollno=3;
		s2.name="ram";
		s2.marks=90;
		
		Student s3=new Student();
		s3.rollno=1;
		s3.name="kiran";
		s3.marks=80;
		
		System.out.println(s1);
		
		Student students[] =new Student[3];
		students[0] =s1;
		students[1] =s2;
		students[2] =s3;
		
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i].name+" : "+students[i].marks);
		}

		//for each loop
		for(Student stud:students) {
			System.out.println(stud.name+":"+stud.marks);
		}
	}

}
