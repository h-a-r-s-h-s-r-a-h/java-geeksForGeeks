// Question.12 :- Find duplicates in array;
package array;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Question12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array u want to make :-");
        int len = input.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<len;i++){
            int a = input.nextInt();
            arr.add(a);
        }
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(arr.get(i)==arr.get(j)){
                    if(Collections.binarySearch(arr1,arr.get(i))<0){
                        arr1.add(arr.get(i));
                    }
                }
            }
        }
        System.out.println(arr1);
        input.close();
    }
}
