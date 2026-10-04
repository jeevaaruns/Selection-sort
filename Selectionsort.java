import java.util.Arrays;

public class Selectionsort{
    static void selectionsort(int[] arr){
        int n = arr.length;
        
        for(int i = 0 ; i < n - 1 ; i ++){
            int min_idx = i;
            
            for(int j = i + 1 ; j < n ; j++){
                if (arr[j] < arr[min_idx]){
                    min_idx = j;
                }
                
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
            
        }
    }
    
    static void printArray(int[] arr){
        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        int[] arr = {54 , 78 , 4 , 72 , 25 , 27 , 13};
        
        System.out.print("Original Array : ");
        printArray(arr);
        
        selectionsort(arr);
        
        System.out.print("Sorted Array : ");
        printArray(arr);
    }
}
