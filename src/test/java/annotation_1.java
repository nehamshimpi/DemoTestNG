import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class annotation_1 {
	public class annotaion_1 {

		@BeforeSuite
		public void m1() {
			//launch
			System.out.println("m1 @BeforeSuite");
		}
		@Test
		public void m3() {
			System.out.println("@Test");
		}
		@AfterSuite
		public void m2() {
			System.out.println("m2 @AfterSuite");
		}
		
		
	}

}
