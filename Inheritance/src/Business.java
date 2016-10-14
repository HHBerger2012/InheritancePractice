
public class Business extends Work
	{
		protected Business(int t, String tt, int e)
		{
			time=t;
			title=tt;
			energy=e;
		}
		protected void loseEnergy()
		{
			System.out.println("Your energy has decreased by 25%");
			energy=energy*0.75;
			System.out.println("It is now at "+energy);
		}
		@Override
		protected void getTitle()
			{
				System.out.println(title);
			}
		@Override
		protected void getDirector()
			{
				
			}
	}