package secondmay;

class Student{
	String name;
	int age;
	Student() {
		System.out.println("Default constructor...");
	}
	Student(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Parameterized where age is "+age+" name is "+name);
	}
	Student(Student s) {
		this.name = s.name;
		this.age = s.age;
		System.out.println("Parameterized where age is "+s.age+" name is "+s.name);
	}
}
public class Practice11{
	public static void main(String[] args) {
		Student obj = new Student();
		Student obj1 = new Student("Mohit", 21);
		Student obj2 = new Student(obj1);
	}
}
