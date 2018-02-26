package oop;

class Person 
{
	String name;
	String email;
	String phone;
	
	void walk()
	{
		System.out.println(name + " is walking");
	}
	void email()
	{
		System.out.println("thats my email id " + email);
	}
	void phone()
	{
		System.out.println("this is my pfone number " + phone);
	}
}
public class Demo 
{
	
	public static void main(String[] args) 
	{
		Person person1= new Person();
		person1.name="Asif";
		person1.email="asif.riaz.1994@gmail.com";
		person1.phone="03474885927";

		person1.walk();
		person1.phone();
		person1.email();
	}

}
