package secondmay;

//parent class
class ParentClass {
	// Whenever a child class constructor gets invoked, it implicitly invokes the
	// constructor of parent class.
	ParentClass() {
		System.out.println("Constructor of ParentClass is called");
	}
}

//child class
public class ConstructorExample extends ParentClass {

	// Instance variables
	String name;
	String street;
	String city;

	ConstructorExample() // this is no-arg constructor
	{
		name = "John";
	}

	ConstructorExample(String pName) // this is parameterized constructor
	{

		name = pName;
	}

	ConstructorExample(int pId, String pName) {
		this("Street 1", "Coimbatore");

		name = pName;

	}

	ConstructorExample(String pStreet, String pCity) {
		street = pStreet;
		city = pCity;
	}

	ConstructorExample(int qId, String qName, String qStreet, String qCity) {
		name = qName;
		street = qStreet;
		city = qCity;
	}

	ConstructorExample(ConstructorExample pObj) {
		name = pObj.name;
		street = pObj.street;
		city = pObj.city;
	}

	void display() {
		System.out.println(name);
		System.out.println(street);
		System.out.println(city);
	}

	public static void main(String[] args) {
		ConstructorExample obj1 = new ConstructorExample(); // no-arg constructor is invoked

		System.out.println(obj1.name);

		ConstructorExample obj2 = new ConstructorExample("Peter");
		System.out.println(obj2.name);

		ConstructorExample obj3 = new ConstructorExample(1, "Kennady");
		System.out.println("\n*** Display obj3 values ***");
		obj3.display();
		ConstructorExample obj4 = new ConstructorExample(obj3);
		System.out.println("\n*** Display obj4 values ***");
		obj4.display();
		ConstructorExample obj5 = new ConstructorExample(2, "MOhit", "Street 2", "Ajmer");
		obj5.display();
	}

}
