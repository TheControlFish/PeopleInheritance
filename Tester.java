
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person bob = new Person("Bob", 1992);
		Student logan = new Student("Marine Transportation", "Logan", 1999);
		Instructor miyagi = new Instructor(120000, "Miyagi", 1932);
		System.out.println(bob.toString());
		System.out.println(logan.toString());
		System.out.println(miyagi.toString());
	}

}
