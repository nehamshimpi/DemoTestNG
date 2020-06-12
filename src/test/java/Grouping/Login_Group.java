package Grouping;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Login_Group {

	@Test(groups="Regression")
	public void TC_Login_01() {
		System.out.println("TC_Login_01 Executed");
	}
	
	@Test(groups="Sanity")
	public void TC_Login_02() {
		System.out.println("TC_Login_02 Executed");
	}
	
	@Test(groups= {"Sanity","Regression"})
	public void TC_Login_03() {
		System.out.println("TC_Login_03 Executed");
	}
	@Test
	public void TC_Login_04() {
		System.out.println("TC_Login_04 Executed");
	}
	
}
