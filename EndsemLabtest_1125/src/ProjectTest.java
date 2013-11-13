import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ProjectTest {

	Project project;
	
	Team team1;
	Person person,person1,person2,person3;
	Role owner,projectManager,teamMember;
	
	Sprint sprint;
	@Before
	public void setUp() throws Exception {
		project = new Project("Online Admission System","JSP");
		
		sprint = new Sprint();
		owner = new Owner();
		projectManager = new ProjectManager();
		teamMember = new TeamMember();
		person1 = new Person("Dhiraj","male",owner);
		
		person2 = new Person("Melinda","female",projectManager);
		
		person3 = new Person("Nirmal","male",teamMember);
	
		team1 = new Team(5,20);
		team1.setOwner(person1);
		team1.setProjectManager(person2);
		team1.setTeamMember(person3);
		
	}

	@Test
	public void test() {
		
	}

}
