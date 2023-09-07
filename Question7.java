// Question.7 :- Move all negative numbers to beginning and positive to end with constant extra space;
package array;
import java.util.Scanner;
public class Question7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array you want to make :- ");
        int len = input.nextInt();
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i] = input.nextInt();
        }
        for(int j=0;j<len;j++){
            for(int k=0;k<j;k++){

            }
        }
        input.close();
    }
}
