// Question.10 :- Find the Missing Number ;
package array;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Question10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array u want to make :-");
        int len = input.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<len;i++){
            int a = input.nextInt();
            arr.add(a);
        }
        System.out.println("Upto which no. u want to search :- ");
        int search = input.nextInt();
        ArrayList<Integer> missing = new ArrayList<Integer>();
        for(int i=1;i<=search;i++){
            if(Collections.binarySearch(arr,i)<0){
                missing.add(i);
            }
        }
        System.out.println("Missing no's are :- "+missing);
        input.close();
    }
}
