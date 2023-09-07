// Question.5 :- Count number of occurrences (or frequency) in a sorted array;
package array;
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length :- ");
        int len = input.nextInt();
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the no you want to find in array :-");
        int find = input.nextInt();
        int x=0;
        for(int i=0;i<len;i++){
            if(arr[i]==find){
                x=x+1;
            }
        }
        System.out.println("No of times of "+find+" in array is "+x);
        input.close();
    }
}
