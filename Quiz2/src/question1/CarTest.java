package question1;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.jupiter.api.Test;

public class CarTest {
	
	@Test
	public void constructorTest() {
		
		try {
			
			Car givenCar = new Car(35000, 0.0, 60, 0.1);
			
		}catch(Exception e) {
			
			fail("failed to instantiate");
		}
		
	}
	
	@Test
	public void monthlyPaymentTest() {
		
		try {
			
			Car givenCar = new Car(35000, 0.0, 60, 0.1);
			assertTrue(givenCar.monthlyPayment() == 743.65);
			
		}catch(Exception e) {
			
			fail("monthlyPayment failed");
			
		}
		
	}
	
	@Test
	public void totalInterestTest() {
		
		try {
			
			Car givenCar = new Car(35000, 0.0, 60, 0.1);
			assertTrue(givenCar.totalInterest() == 9618.79);
			
		}catch(Exception e) {
			
			fail("monthlyPayment failed");
			
		}
		
	}

}
