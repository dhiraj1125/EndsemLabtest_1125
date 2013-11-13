
public class Person {

	private String name;
	private String gender;
	private Role role;

	public Person(String name, String gender, Role role) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.gender = gender;
		this.role = role;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	public Role getRole() {
		// TODO Auto-generated method stub
		return this.role;
	}
	public String getGender() {
		// TODO Auto-generated method stub
		return this.gender;
	}
	public void display(){
		System.out.println("Name: "+ this.name + " Gender: "+ this.gender + " Role: "+ this.role);
	}

}
