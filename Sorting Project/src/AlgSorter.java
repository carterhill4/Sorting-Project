import java.util.Comparator;

public class AlgSorter implements Comparator <TimeSorter>
	{
			
		public int compare (TimeSorter s1, TimeSorter s2)
		{
			if(s1.getSortTime() < s2.getSortTime())
				{
					return 1;
				}
			
			else 
				{
					return -1;
		}
		
	}
}