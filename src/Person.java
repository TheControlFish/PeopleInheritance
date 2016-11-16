
public class Person {
	private String name;
	private int yearOfBirth;
	public Person(String n, int y){
		name = n;
		yearOfBirth = y;
	}
	public String toString(){
		return ("Name: " + name + ", Year of Birth: " + yearOfBirth);
	}
}
