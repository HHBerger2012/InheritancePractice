
public class Movie extends Entertainment
	{
		protected String director;
		protected String genre;
		public Movie(int t, String tt, int c, String d, String g)
		{
			time=t;
			title=tt;
			cost=c;	
			director=d;
			genre=g;
		}
		@Override
		protected void getDirector()
			{
					System.out.println(director);
			}
		@Override
		protected void getTitle()
			{
				System.out.println(title);
			}
	}