import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ProjectTest {

	Project project,project1;
	
	Team team1;
	Person person,person1,person2,person3;
	Role owner,projectManager,teamMember;
	
	Sprint sprint;
	@Before
	public void setUp() throws Exception {
		project = new Project("Online Admission System","JSP");
		project1 = new Project("Social networking Site","ruby on rails");
		
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
		assertEquals("Online Admission System", project.getProjectName());
		assertEquals("Social networking Site", project1.getProjectName());
	}

}
