import org.testng.annotations.Test;

public class priority_TestAnnotations {
	@Test(priority=2)
	public void A1a1() {
		System.out.println("@Test A1m1");
	}
	
	@Test(priority=4)
	public void aM1() {
		System.out.println("@Test aM1");
	}
	
	@Test(priority=1)
	public void a1M1() {
		System.out.println("@Test a1M1");
	}
	@Test(priority=3)
	public void A2M1() {
		System.out.println("@Test A2M1");
	}
}
