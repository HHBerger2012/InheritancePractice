import java.util.ArrayList;
public class TimeRunner
	{

		public static void main(String[] args)
			{
				ArrayList <TimeExpendatures> time = new ArrayList<TimeExpendatures>();
				time.add(new Movie(143, "Pirates of the Carribean",12," Director- Ted Elliot","Fantasy Fiction"));
				time.add(new Business(120,"Stock Option Meeting",10));
				time.add(new SelfImprovement(60,"Workout",10));
				time.add(new SocialEvent(150,"Steve's Birthday Party",0,"Steve's House",50,"Water, Lemonade, and Fruit Punch"));
				
				for (TimeExpendatures t : time)
					{
						t.getTitle();
						t.stateTimeExpendatureType();
						t.getTime();
						System.out.println();
					}
			}
	}
