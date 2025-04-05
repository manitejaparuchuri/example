package grouping;

import org.testng.annotations.Test;

public class paymenttest {
	
	@Test(priority = 1,groups = {"sanity","regression"})
	public void payinindia() {
		System.out.println("pay in india");
	}

	@Test(priority = 2,groups = {"sanity","regression"})
	public void payinus() {
		System.out.println("pay in us");
	}

	@Test(priority = 3,groups = {"sanity","regression"})
	public void payinafrica() {
		System.out.println("pay in africa");
	}

}
