// Question.6 :- Find Subarray with given sum;
package array;
import java.util.Scanner;
public class Question6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array of you want to make :- ");
        int len = input.nextInt();
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the sum which you want to find : -");
        int sum = input.nextInt();
        int x=0;
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                x=x+arr[j];
                if(sum == x){
                    System.out.println("Sum starts from "+i+" ends at "+j);
                }
            }
            x=0;
        }
        input.close();
    }
}
