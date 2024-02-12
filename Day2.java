/*Rearrange Array Alternately */
/* n = 6
arr[] = {1,2,3,4,5,6}
Output: 6 1 5 2 4 3 */
import java.util.*;
class Day2{
    public static void rearrange(long arr[], int n){
        
        
              long[] a= new long[n];
       Arrays.sort(arr);
       int cnt=0;
       if(n>1){
           for(int i=0;i<n/2;i++){
               a[cnt++]=arr[n-1-i];
               a[cnt++]=arr[i];
           }
           if(n%2!=0){
               a[cnt++]=arr[n/2];      
           }
       for(int i=0;i<n;i=i+1){
           arr[i]=a[i];
       }
           
       }
    }
}