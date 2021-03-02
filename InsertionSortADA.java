import java.util.*;
public class InsertionSortADA{  
      public static void main(String[] args) {  
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the size of array :");
                int size = 100000;
                int arr[] =new int[size];
                for(int i = 0; i<10; i++){
                  System.out.print("\nEnter element no "+(i+1)+" : ");
                  arr[i] = sc.nextInt();
                } 
      } 
      
      void sort(int arr[]) { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
    }          
}
