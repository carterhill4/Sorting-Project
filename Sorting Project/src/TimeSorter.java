
public class TimeSorter
	{
		private String sortName;
		private double sortTime;
		
		public TimeSorter(String s, double t)
		{
			
			sortName = s;
			
			sortTime = t;
			
			}

		public String getSortName()
			{
				return sortName;
			}

		public void setSortName(String sortName)
			{
				this.sortName = sortName;
			}

		public double getSortTime()
			{
				return sortTime;
			}

		public void setSortTime(double sortTime)
			{
				this.sortTime = sortTime;
			}
	}
