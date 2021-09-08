
public class EligibilityCalculator {
	public boolean eligibleForScholarship(StudentInfo stInfo) {
		if(stInfo.getPercentage()<=90)
			return true;
		return false;
	}
}
