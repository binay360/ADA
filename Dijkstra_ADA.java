import java.util.*;
class Dijkstra_ADA{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int arr[][] = {{100,3,100,100,5},{100,100,8,5,3},{100,100,100,100,100},{100,100,2,100,100},{100,100,100,4,100}};
      dijs(arr);
   }
   public static void dijs(int[][] arr){
      int r = arr.length;
      int total = 0;
      int[] ind = new int[r];
      int[] cost = new int[r];
      cost[0] = 0;
      ind[0] = 0;
      for(int i = 1; i<r ; i++){
         ind[i] = r+1;
      }
      int[] a = new int[3];
      for(int j = 1; j<r ; j++){
         a[0] = 100;
         for(int i : ind){

            if(i<r){
               a = min(arr[i],i,a);
            }
         }
         ind[j] = a[1];
         cost[j] = a[0];
         arr[a[2]][a[1]] = 100;
         arr[a[1]][a[2]] = 100;
         for(int l = 0; l<r ; l++){
            arr[l][a[1]] = 100;
         }
         for(int l = 0; l<r ; l++){
            arr[a[1]][l] = arr[a[1]][l] + a[0];
         }
      }
      
      System.out.println("Vertices     Cost");
      System.out.println((char)(ind[0]+97)+"            0");
      for(int i = 1; i<r ; i++){
         System.out.println((char)(97+ind[i])+"            "+(cost[i]));
      }
   }
   public static int[] min(int arr1[], int k, int[] a){
      int mini[] = a;
      for(int i =0; i<arr1.length ; i++){
         if(arr1[i]<mini[0]){
            mini[0] = arr1[i];
            mini[1] = i;
            mini[2] = k;
         }
      }
      return mini;
   }
}