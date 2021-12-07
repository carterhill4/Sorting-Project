
public class TimePOJO
	{
		private String sortName;
		private double sortTime;
		
		public TimePOJO(String s, double t)
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
