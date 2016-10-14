
public abstract class TimeExpendatures
	{
		protected int time;
		protected String title;
		protected abstract void stateTimeExpendatureType();
		protected abstract void getDirector();
		protected abstract void getTitle();
		public void getTime()
			{
				System.out.println(time);
			}
	}