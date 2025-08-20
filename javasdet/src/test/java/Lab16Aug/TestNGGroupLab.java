package Lab16Aug;

import org.testng.annotations.Test;

public class TestNGGroupLab {

	@Test (groups = {"Smoke"})

	public void LoginTest() {

		System.out.println("LoginTest is executed");


	}

	@Test (groups = {"Regression"})

	public void paymentTest() {

		System.out.println("paymentTest is executed");


	}

	@Test (groups = {"Smoke","Regression"})

	public void logoutTest() {

		System.out.println("logoutTest is executed");


	}

 
}
