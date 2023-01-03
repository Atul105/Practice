class Student{
	String name;
	String lastName;
	int id;
	
	public Student(String name, String lastName, int id) {
		this.name = name;
		this.lastName = lastName;
		this.id = id;
	}

	@Override
	public String toString() {
		return "name= " + name + ", lastName= " + lastName + ", id= " + id ;
	}
	
	
}




public class Arrays {

	public static void main(String[] args) {
		
		Object[] s1 = new Object[3];
		
		s1[0] = new Student("ram", "mahato",1);
		System.out.println(s1[0]);

	}

}
