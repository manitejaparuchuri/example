package grouping;

import org.testng.annotations.Test;

public class logintest {
	
	@Test(priority = 1,groups = {"sanity"})
	public void loginbyemail() {
		System.out.println("login by emal ");
	}

	@Test(priority = 2,groups = {"sanity"})
	public void loginbyfb() {
		System.out.println("login by fb ");
	}

	@Test(priority = 3,groups = {"sanity"})
	public void loginbytwitter() {
		System.out.println("login by twitter ");
	}

}
