/*Find which has Majority  
 * int arr[]={1,1,2,2,3,3,4,4,4,4,5}
 * x and y are any two element 
 * find which is in majority(frequency)
 * if frequency of both are same 
 * return smaller one from both
*/
import java.util.*;
class Day1 {

    static int majorityWins(int arr[], int n, int x, int y) {
        int count_x = 0;
        int count_y = 0;
        for (int index = 0; index < n; index++) {
            if (arr[index] == x) {
                count_x++;
            }
            if (arr[index] == y) {
                count_y++;
            }
        }
        if (count_x > count_y) {
            return x;
        } else if (count_x < count_y) {
            return y;
        }

        return Math.min(x, y);

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int arr[]={1,1,2,2,3,3,4,5,5,5,5};
        int n=arr.length;
        System.out.println("Enter x and y:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(majorityWins(arr,n,x,y));
    }
}
