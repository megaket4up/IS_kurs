package Program;

public class InsurancePolicyCalcBL 
{
	// input data
	private double period = 0;              
	private double power = 0;       
	private double experience = 0; 
	
	// output data
	private double totalCost;    
	
	// constructor
	public InsurancePolicyCalcBL(final double period, final double power, final double experience)
	{
		// TODO: Organize the check of negative and zero values ​​of parameters. 
		//       For negative and zero parameter values assign fields to a value of zero. 
		//       Otherwise, assign the parameter values ​​to the fields and call the Calculate() method.
		if (period <= 0 || power <= 0 || experience <= 0) 
		{ 
			totalCost = 0; 
		} else {
			this.period = period;
			this.power = powerInKW(power);
			this.experience = experienceCoefficient(experience);

			Calculate();
		}
	}
	
	// Calculation of experience coefficient
	public double experienceCoefficient(final double experience) {
		if (experience < 10) {
			return 25;
		} else if (experience >= 10 && experience < 20) {
			return 15;
		} else {
			return 10;
		}
	}
	
	// Calculation of power in kilowatts
	public double powerInKW(final double power) {
		return power * 0.735499;
	}	
	
	// calculating method
	private void Calculate()
	{
		totalCost = period * power * experience;
	}
	
	// getter for totalCost
	public double getCost()
	{
		return totalCost;
	}
}

