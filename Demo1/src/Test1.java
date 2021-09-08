import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class Test1 {
	
	StudentInfo studentInfo=null;
	EligibilityCalculator eligibilityCalculator=new EligibilityCalculator();
	
	@BeforeEach
	public void setup()throws Exception{
		studentInfo=new StudentInfo();
	}

	@AfterEach
	public void tearDown() throws Exception{
		studentInfo=null;
	}
	
	@Test
	public void testEligibleForScholarship_validPercentage() {
		studentInfo.setStudentId(100);
		studentInfo.setStudentName("Susmita");
		studentInfo.setPercentage(92.5);
		assertTrue(eligibilityCalculator.eligibleForScholarship(studentInfo));
	}
	
	@Test
	public void testEligibleForScholarship_invalidPercentage() {
		studentInfo.setStudentId(101);
		studentInfo.setStudentName("Amit");
		studentInfo.setPercentage(75.8);
		assertFalse(eligibilityCalculator.eligibleForScholarship(studentInfo));
	}

}
