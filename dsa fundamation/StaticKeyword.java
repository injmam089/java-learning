public class StaticKeyword{
	public static void main(String []args){
		Student s1=new Student("abc",20,101);
		Student s2=new Student("cde",22,102);
		System.out.println(s1.name+" "+s2.age+" "+s1.rollNo+" "+Student.college);
		System.out.println(s2.name+" "+s2.age+" "+s2.rollNo+" "+Student.college);
	}
}
class Student{
	String name;
	int age;
	int rollNo;
	static String college="abcdef";
	Student(String name, int age, int rollNo){
		this.name=name;
		this.age=age;
		this.rollNo=rollNo;
	}
}