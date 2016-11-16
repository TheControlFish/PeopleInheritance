
public class Student extends Person{
	private String major;
	public Student(String m, String n, int y){
		super(n,y);
		major = m;
	}
	public String toString(){
		return (super.toString() + ", major: " + major);
	}
}
