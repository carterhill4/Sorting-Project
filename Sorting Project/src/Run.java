import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Run
	{

		static ArrayList <TimeSorter> sortedTimes = new ArrayList<TimeSorter>();
		
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
					
					//computing statement
					System.out.println();
					System.out.println("Computing...");
					System.out.println();
					
					//decimal format
					//DecimalFormat d = new DecimalFormat("0.0000");
					
					//insertion sort call
					double startTimeQuickI = System.currentTimeMillis();
					
					for(int n = 0; n < numOfSims; n++)
						{
							InsertionSort.insertionSort(insertionArray);
						}
					double endTimeQuickI = System.currentTimeMillis();
					double InsertionTime = endTimeQuickI - startTimeQuickI;
					
					double formatInsertTime = InsertionTime / 1000;

				
					
					
					//selection sort call
					double startTimeQuickS = System.currentTimeMillis();
					
					for(int n = 0; n < numOfSims; n++)
						{
							SelectionSort.selectionSort(selectionArray);
						}
					double endTimeQuickS = System.currentTimeMillis();
					double SelectionTime = endTimeQuickS - startTimeQuickS;
					
					double formatSelectionTime = SelectionTime / 1000;

				
					
					
					//merge sort call
					double startTimeQuickM = System.currentTimeMillis();
					
					for(int n = 0; n < numOfSims; n++)
						{
							MergeSortDemo.mergeSort(mergeArray,amount);
						}
					double endTimeQuickM = System.currentTimeMillis();
					double MergeTime = endTimeQuickM - startTimeQuickM;
					
					double formatMergeTime = MergeTime / 1000;

				
					
					//quick sort call
					double startTimeQuickQ = System.currentTimeMillis();
					
					for(int n = 0; n < numOfSims; n++)
						{
							QuicksortInt.qsort(quickArray);
						}
					double endTimeQuickQ = System.currentTimeMillis();
					double QuickTime = endTimeQuickQ - startTimeQuickQ;
					
					double formatQuickTime = QuickTime / 1000;

					
					
					
					//bubble sort call
					double startTimeQuickB = System.currentTimeMillis();
					
					for(int n = 0; n < numOfSims; n++)
						{
							BubbleSort.bubbleSort(bubbleArray);
						}
					double endTimeQuickB = System.currentTimeMillis();
					double BubbleTime = endTimeQuickB - startTimeQuickB;
					
					double formatBubbleTime = BubbleTime / 1000;

					
					
					
					sortedTimes.add(new TimeSorter("Insertion", formatInsertTime));
					
					sortedTimes.add(new TimeSorter("Selection", formatSelectionTime));
					
					sortedTimes.add(new TimeSorter("Merge", formatMergeTime));
					
					sortedTimes.add(new TimeSorter("Quick", formatQuickTime));
					
					sortedTimes.add(new TimeSorter("Bubble", formatBubbleTime));
					
					
					
					Collections.sort(sortedTimes, new AlgSorter());
					
					sortedTimes.sort(Comparator.comparing(TimeSorter::getSortTime));
			
					int place = 1;
					
					for(TimeSorter s: sortedTimes)
						{
							System.out.printf("%-20s", place + "." + s.getSortName());
							System.out.printf("%.3f", s.getSortTime());
							System.out.printf("%-2s", " seconds");
							System.out.println();
							place++;
						}
					
	}
			
			
	}
			
	
	
