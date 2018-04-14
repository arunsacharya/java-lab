/* 5. Searching and sorting are the often used parts in any program. Create two Java packages for searching and sorting. (hint: use PACKAGE & MULTI-THREAD)
a. Implement some basic searching and sorting methods in the packages.
b. Search for a particular student in a student list of CSE department. sort the elements before performing the binary search. Use methods defined in the packages. (Use sequential threads)
c. Sort same student list concurrently using different sorting methods available in the packages. (use Concurrent threads) */

package lab_programs;

import algorithms.search.*;
import algorithms.sort.*;

class Sort extends Thread{
	String str;
	Sort(int i){
		if(i==1) {
			str="Bub";
			}
		else
			str="Sel"; 
	}
	public void run(){
		int arr[]={5,3,1,6,4};
		int arr1[]={25,23,21,26,24};
		
		int array[];
		int n=5;
		if(str.equals("Bub"))
			{
			BubbleSort bubsort=new BubbleSort();
			array=bubsort.bubbleSort(arr1, n);
			for(int i=0;i<array.length;i++)
			System.out.println(array[i]);
			}
			else
			{
				SelectionSort selsort=new SelectionSort();
				array=selsort.selectionSort(arr,n);
				for(int i=0;i<array.length;i++)
				System.out.println(array[i]);
			}
		}
	}

class Search extends Thread{
	public void run(){
		int arr[]={15,13,11,16,14};
		int array[];
		int n=5,key=13;
		BubbleSort bubsort=new BubbleSort();
		array=bubsort.bubbleSort(arr, n);
		BinarySearch bs=new BinarySearch();
		bs.binarySearch(array, n, key);
	}
}

public class pgm5 {
public static void main(String[] args) {
	Sort s1=new Sort(1);
	Sort s2=new Sort(2);
	System.out.println("sorting using bubble sort");
	s1.start();
	s2.start();
	System.out.println("sorting using selection sort");
	Search s3=new Search();
	s3.start();
}
}
