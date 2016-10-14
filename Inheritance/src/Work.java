
public abstract class Work extends TimeExpendatures
	{
		protected double energy;
		protected int calories;
		@Override
		protected void stateTimeExpendatureType()
		{
			System.out.println("Work is tiring, but at least you're either making money or self-improving!");
		}
		protected abstract void loseEnergy();
	}
