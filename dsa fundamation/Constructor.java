/*public class Constructor{
	public static void main(String[] args){
		Student s1= new Student();
		System.out.println(s1.college);
	}
}
class Student{
	String name;
	int age; 
	String college;
} // default made by itself.
*/
public class Constructor{
	public static void main(String[] args){
		Student s1= new Student("Socrate",35,101,"Greek philosopher");
		Student s2= new Student();
		System.out.println("Your name is "+s1.name+", "+"you are "+s1.age+" year old"+". "+"Your rollNo is "+s1.rollNo+", "+"You are known as a "+s1.occupation);
		System.out.println(s2.age);
	}
}

class Student{
	String name;
	int age;
	int rollNo;
	String occupation;
	Student(String name, int age, int rollNo, String occupation){
		this.name=name;
		this.age=age;
		this.rollNo=rollNo;
		this.occupation=occupation;
	}
	Student(){
		/*	In this program, default constructor not made its own, 
		once you create your own constructor then program do not create its own constructor. */
	}
	
}