package algorithms.sort;

public class BubbleSort {
public int [] bubbleSort(int arr[],int n){ 
    int temp = 0;  int i=0;
     for(; i < n; i++){  
             for(int j=1; j < (n-i); j++){  
                      if(arr[j-1] > arr[j]){  
                             //swap elements  
                             temp = arr[j-1];  
                             arr[j-1] = arr[j];  
                             arr[j] = temp;  
                      		}  
                      
             	}  
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
