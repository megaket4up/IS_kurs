package JUnitTests;

import static org.junit.Assert.*;
import org.junit.Test;

import Program.InsurancePolicyCalcBL;

public class TestSetThree 
{
	@Test
	public void test() 
	{
		InsurancePolicyCalcBL ic;
		
		double period = 0;
		double power = 0;
		double experience = 0;
		double cost = 0;
		
		double delta;
		
		double expectedCost;
		double actualCost;
		
		// TODO: Create an equals test via assertEquals() here
		period = 12d;
		power = 80d;
		experience = 25d;
		
		ic = new InsurancePolicyCalcBL(period, power, experience);
		
		expectedCost = 7060.79d;
		actualCost = ic.getCost();
		
		delta = .01d;
		assertEquals(expectedCost, actualCost, delta);
		
		// TODO: Create an equals test for negative parameters via assertEquals() here
		period = -12d;
		power = -80d;
		experience = -3d;
		
		ic = new InsurancePolicyCalcBL(period, power, experience);
		
		expectedCost = 0;
		actualCost = ic.getCost();
		
		delta = 0d;
		assertEquals(expectedCost, actualCost, delta);
	}
}
