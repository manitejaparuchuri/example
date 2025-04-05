package grouping;

import org.testng.annotations.Test;

public class signuptest {
	
	@Test(priority = 1,groups = {"sanity"})
	public void signupbyemail() {
		System.out.println("sign up by email");
	}

	@Test(priority = 2,groups = {"regression"})
	public void signupbyfb() {
		System.out.println("sign up by fb");
	}

	@Test(priority = 3,groups = {"regression"})
	public void signupbytwitter() {
		System.out.println("sign up by twitter");
	}

}
