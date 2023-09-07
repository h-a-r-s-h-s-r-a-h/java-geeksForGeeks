// Question.3 :- to reverse the array;
package array;
import java.util.Arrays;
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array :- ");
        int len = input.nextInt();
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Original Array : - "+Arrays.toString(arr));
        int[] reversed_array = new int[len];
        int j = len-1;
        for(int i=0;i<len;i++){
            reversed_array[i] = arr[j];
            j=j-1;
        }
        System.out.println("Reversed Array :- "+Arrays.toString(reversed_array));
        input.close();
    }
}
