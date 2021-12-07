import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Run
	{

		static ArrayList <TimePOJO> sortedTimes = new ArrayList<TimePOJO>();
		
		public static void main(String[] args)
			{
				Scanner tanner = new Scanner(System.in);
				
				System.out.println("How many times do you want to run the simulation?");

				//reads how many times to run simulation
				int numOfSims = tanner.nextInt();
			
				
				System.out.println("How many numbers do you want to sort?");
				
					
							int amount = tanner.nextInt();
							
							int [] originalArray = new int [amount];
						
					for(int j = 0; j < amount; j ++) 
						{
							int secretNumber = (int) (Math.random() * 90) + 10;
						}
					
					//arrays
					int [] insertionArray = originalArray;
					int [] selectionArray = originalArray;
					int [] mergeArray = originalArray;
					int [] quickArray = originalArray;
					int [] bubbleArray = originalArray;
					
					//decimal format
					DecimalFormat d = new DecimalFormat("0.0000");
					
					//insertion sort call
					double startTimeQuickI = System.currentTimeMillis();
					
					for(int n = 0; n < numOfSims; n++)
						{
							InsertionSort.insertionSort(insertionArray);
						}
					double endTimeQuickI = System.currentTimeMillis();
					double InsertionTime = endTimeQuickI - startTimeQuickI;
					
					double formatInsertTime = InsertionTime / 1000;

					//System.out.println("Insertion sort = " + (d.format(formatInsertTime)) + " seconds");
					
					
					//selection sort call
					double startTimeQuickS = System.currentTimeMillis();
					
					for(int n = 0; n < numOfSims; n++)
						{
							SelectionSort.selectionSort(selectionArray);
						}
					double endTimeQuickS = System.currentTimeMillis();
					double SelectionTime = endTimeQuickS - startTimeQuickS;
					
					double formatSelectionTime = SelectionTime / 1000;

					//System.out.println("Selection sort = " + (d.format(formatSelectionTime)) + " seconds");
					
					
					//merge sort call
					double startTimeQuickM = System.currentTimeMillis();
					
					for(int n = 0; n < numOfSims; n++)
						{
							MergeSortDemo.mergeSort(mergeArray,amount);
						}
					double endTimeQuickM = System.currentTimeMillis();
					double MergeTime = endTimeQuickM - startTimeQuickM;
					
					double formatMergeTime = MergeTime / 1000;

					//System.out.println("Merge sort = " + (d.format(formatMergeTime)) + " seconds");
					
					//quick sort call
					double startTimeQuickQ = System.currentTimeMillis();
					
					for(int n = 0; n < numOfSims; n++)
						{
							QuicksortInt.qsort(quickArray);
						}
					double endTimeQuickQ = System.currentTimeMillis();
					double QuickTime = endTimeQuickQ - startTimeQuickQ;
					
					double formatQuickTime = QuickTime / 1000;

					//System.out.println("Quick sort = " + (d.format(formatQuickTime)) + " seconds");
					
					
					//bubble sort call
					double startTimeQuickB = System.currentTimeMillis();
					
					for(int n = 0; n < numOfSims; n++)
						{
							BubbleSort.bubbleSort(bubbleArray);
						}
					double endTimeQuickB = System.currentTimeMillis();
					double BubbleTime = endTimeQuickB - startTimeQuickB;
					
					double formatBubbleTime = BubbleTime / 1000;

					//System.out.println("Bubble sort = " + (d.format(formatBubbleTime)) + " seconds");
					
					
					sortedTimes.add(new TimePOJO("Insertion", formatInsertTime));
					
					sortedTimes.add(new TimePOJO("Selection", formatSelectionTime));
					
					sortedTimes.add(new TimePOJO("merge", formatMergeTime));
					
					sortedTimes.add(new TimePOJO("Quick", formatQuickTime));
					
					sortedTimes.add(new TimePOJO("Bubble", formatInsertTime));
					
					Collections.sort(sortedTimes. new TimeSorter.compare());
					
					sortedTimes.sort(Comparator.comparing(TimePOJO::getSortTime));
			
			}
			
			
	}
			
	
	
