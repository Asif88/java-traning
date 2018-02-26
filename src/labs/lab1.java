package labs;

public class lab1 {
	public static void main(String[] args)
	{
		Student std1=new Student("Asif","1235674343");
		Student std2=new Student("Atif","4563454352");
		Student std3=new Student("Fahad","789123123");
		std1.enroll("English");
		std1.enroll("Math");
		std1.enroll("Computer");
		
		std1.showCourses();
		std1.checkBalance();
		
		std1.payTution(600);
		std1.checkBalance();
		System.out.println(std1.toString());
	}

}
class Student
{
	private static int id=10;
	private String userId;
	private String name;
	private String ssn;
	private String email;
	private String phone;
	private String city;
	private String State;
	private String courses= "";
	private static final int costOfCourse=800;
	private int balance =0;
	
	public Student(String name, String ssn)
	{
		id++;
		this.name=name;
		this.ssn=ssn;
		setEmail();
		setUserId();
	}
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getEmail()
	{
		return email;
	}
	private void setEmail()
	{
		email = name.toLowerCase()+id+"@iub.com";
		System.out.println("Your email: "+email);
	}
	
	private void setUserId()
	{
		int max=9000;
		int min=1000;
		int random=(int) (Math.random()*((max-min)));
		random=random+min;
		userId=id+random+ssn.substring(5);
		System.out.println("Your User ID: "+userId);
	}
	public void enroll(String course)
	{
		this.courses=course;
		System.out.println(courses);
		balance = balance *costOfCourse;
	}
	public void payTution(int amount)
	{
		System.out.println("Payment: $"+amount);
		balance=balance-amount;
	}
	public void checkBalance()
	{
		System.out.println("Balance: $"+balance);
	}
	public void showCourses()
	{
		System.out.println(courses);
	}
	public String toString()
	{
		return "[NAME: " +name+"]\n[COURSES: "+courses+"]\n[BALANCE: " + balance+"]";
	}
}