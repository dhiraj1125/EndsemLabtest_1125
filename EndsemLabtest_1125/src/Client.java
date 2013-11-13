
public class Client {

	private static Project project1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Role owner = owner, Team_member = Team_member;
		Person p1 = new Person("sanju", "female", owner);
		p1.display();
		Person p2 = new Person("Raj", "male", Team_member);
		p2.display();
		Person p3 = new Person("munib", "male", Team_member);
		p3.display();
		Person p4 = new Person("anil", "male", Team_member);
		p4.display();
		Person p5 = new Person("Nadia", "female", Team_member);
		p5.display();
		
		Team team = new Team(5, 30);
		team.setProjectManager(p1);
		team.setOwner(p2);
		team.setTeamMember(p3);
		team.setTeamMember(p4);
		team.setTeamMember(p5);
		
		//team.displayTeam();
		
		
		Stories s1 = new Stories(new Task("Login", 3), 1, 5);
		s1.DisplayStory();
		Stories s2 = new Stories(new Task("Database Creation", 1), 6, 3);
		s2.DisplayStory();
		Stories s3 = new Stories(new Task("UserInterface", 5), 7, 7);
		s3.DisplayStory();
	}

}
