package common;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import org.testng.ITestResult;

public class VerificationFailures extends HashMap<ITestResult, List<Throwable>> {
	public VerificationFailures() {
		super();
	}
	
	public static VerificationFailures getFailures() {
		if(failures==null) {
			failures=new VerificationFailures();
		}
		return failures;
	}
	
	public List<Throwable> getFailuresForTest(ITestResult result) {
		List<Throwable> expections=get(result);
		return expections ==null? new ArrayList<Throwable>():expections;
	}

	public void addFailureForTest(ITestResult result, Throwable throwable) {
		List<Throwable> expections=getFailuresForTest(result);
		expections.add(throwable);
		put(result, expections);
	}
	
	private static final long serialVersionUID = 1L;
	private static VerificationFailures failures;

}

