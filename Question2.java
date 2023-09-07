//Question2 :- to pick maximum and minimum no from array;
package array;
import java.util.Scanner;
import java.util.Arrays;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array u want to make");
        int len = input.nextInt();
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            //int a = input.nextInt();
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("MAX VALUE :- "+arr[len-1]);
        System.out.println("MIN VALUE :- "+arr[0]);
        input.close();
    }
}
