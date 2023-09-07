// Question.4 :- sorting an array;
package array;
import java.util.Scanner;
import java.util.Arrays;
public class Question4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array you want to make :-");
        int len = input.nextInt();
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            int no = input.nextInt();
            arr[i]=no;
        }
        System.out.println("Original Array :- "+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted array :- "+Arrays.toString(arr));
        input.close();
    }
}
