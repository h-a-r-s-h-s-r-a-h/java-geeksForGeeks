// Question.11 :- Count pairs with given sum;
package array;
import java.util.Scanner;
public class Question11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array u want to make :-");
        int len = input.nextInt();
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i] =input.nextInt();
        }
        System.out.println("Enter the sum which u want to find :- ");
        int sum = input.nextInt();
        int x=0;
        int y=0;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                x = arr[i] +arr[j];
                if(x==sum){
                    y=y+1;
                }
                x=0;
            }
        }
        System.out.println("Total pair is :- "+y);
        input.close();
    }
}
