// Question.6 :- Program to cyclically rotate an array by one;
package array;
import java.util.Scanner;
import java.util.Arrays;
public class Question9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array you want to made :-");
        int len = input.nextInt();
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i] = input.nextInt();
        }
        int[] arr1 = new int[len];
        arr1[0] = arr[len-1];
        for(int i=0;i<len-1;i++){
            arr1[i+1] = arr[i];
        }
        System.out.println("Rotated array is :-");
        System.out.println(Arrays.toString(arr1));
        input.close();
    }
}
