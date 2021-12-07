
public class BubbleSort
	{
		public static void bubbleSort(int[] elements)
		{
		int n = elements.length;
		int temp = 0;
			{
				for(int i = 0; i < n; i++)
					{
						for(int j = 1; j < (n-1); j++)
							{
								if(elements[j - 1] > elements[j]) 
									{
										temp = elements[j - 1];
										elements[j - 1] = elements [j];
										elements[j] = temp;
									}
							}
					}
			}
		}
	}	