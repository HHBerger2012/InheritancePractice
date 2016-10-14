
public class SocialEvent extends Entertainment
	{
		protected String location;
		protected int numOfPeople;
		protected String refreshments;
		protected double popularity = 10;
		protected SocialEvent(int t, String tt, int c, String l, int n, String r)
		{
		time=t;
		title=tt;
		cost=c;
		location=l;
		numOfPeople=n;
		refreshments=r;
		}
		protected void meetPeople()
		{
			System.out.println("You met 10 new people, increasing your popularity rate by 235%!");
			popularity = popularity*1.25;
			System.out.println("Your popularity level is now "+popularity);
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