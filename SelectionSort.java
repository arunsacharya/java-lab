package algorithms.sort;

public class SelectionSort {
 public int [] selectionSort(int arr[],int n){
	 int i = 0;
	   for (; i < n - 1; i++)  
       {  
           int index = i;  
           for (int j = i + 1; j < n; j++){  
               if (arr[j] < arr[index]){  
                   index = j;//searching for lowest index  
               }  
           }  
           int smallerNumber = arr[index];   
           arr[index] = arr[i];  
           arr[i] = smallerNumber;  
          // System.out.println("Sorting using Selection Sort");
           try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       } 
	 return arr;
 }
}
