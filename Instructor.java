
public class Instructor extends Person{
	private int salary;
	public Instructor(int s, String n, int y){
		super(n,y);
		salary = s;
	}
	public String toString(){
		return(super.toString() + ", salary: " + salary);
	}
}
