package JUnitTests;

import static org.junit.Assert.*;
import org.junit.Test;

import Program.InsurancePolicyCalcBL;

public class TestSetFour 
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
		period = 15d;
		power = 180d;
		experience = 55d;
		
		ic = new InsurancePolicyCalcBL(period, power, experience);
		
		expectedCost = period * ic.powerInKW(power) * ic.experienceCoefficient(experience);
		actualCost = ic.getCost();
		
		delta = 0d;
		assertEquals(expectedCost, actualCost, delta);
		
		// TODO: Create an equals test for negative parameters via assertEquals() here
		period = -15d;
		power = -180d;
		experience = -55d;
		
		ic = new InsurancePolicyCalcBL(period, power, experience);
		
		expectedCost = 0;
		actualCost = ic.getCost();
		
		delta = 0d;
		assertEquals(expectedCost, actualCost, delta);
	}
}
