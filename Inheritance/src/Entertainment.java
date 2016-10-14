
public abstract class Entertainment extends TimeExpendatures
	{
		protected double cost;
		protected double entertainmentLevel=10;
		@Override
		protected void stateTimeExpendatureType()
		{
			System.out.println("Entertainment is fun! No money made but it will be a good time");
		}
		protected void getEntertained()
			{
				System.out.println("Your level of enteratinment has gone up 25%!");
				entertainmentLevel=entertainmentLevel*1.25;
				System.out.println("It is now "+entertainmentLevel);
			}
	}