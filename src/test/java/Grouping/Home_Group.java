package Grouping;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Home_Group {

	@Test(groups="Regression")
	public void TC_Home_01() {
		System.out.println("TC_Home_01 Executed");
	}
	
	@Test(groups="Sanity")
	public void TC_Home_02() {
		System.out.println("TC_Home_02 Executed");
	}
}
