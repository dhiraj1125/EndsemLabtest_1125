import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class PersonTest {

	Person person;
	Role owner;
	ProjectManager projectManager;
	TeamMember teamMember;
	@Before
	public void setUp() throws Exception {
		owner = new Owner();
		projectManager = new ProjectManager();
		teamMember = new TeamMember();
		
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
	}

}
