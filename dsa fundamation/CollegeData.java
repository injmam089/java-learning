public class CollegeData{
	public static void main(String []args){
		student s1= new student();
		student s2= new student();
		s1.name="falana";
		s1.rollNumber= 101;
		s1.age=20;
		s1.college="falana college institute";
		s2.name="thekana";
		s2.rollNumber= 102;
		s2.age= 24;
		s2.college="thekana college institute";
		s1.marksAttendence();
		s2.marksAttendence();
		s1.print();
		s2.print();
	}
}
class student{
		String name;
		int rollNumber;
		int age;
		String college;
		void marksAttendence(){
			System.out.println("Attendence marked by "+ name);
		}
		void print(){
		 	System.out.println(name+", "+ rollNumber+", "+age+", "+college);
		}
}