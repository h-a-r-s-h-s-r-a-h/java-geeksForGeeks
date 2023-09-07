//Question.8 :- Union and Intersection of two sorted arrays;
package array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Question8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> all_no = new ArrayList<Integer>();
        System.out.println("Enter the length of 1st array you want to made :- ");
        int len1 = input.nextInt();
        int[] arr1 = new int[len1];
        System.out.println("Enter the elements of 1st array :- ");
        for(int i=0;i<len1;i++){
            arr1[i] = input.nextInt();
            all_no.add(arr1[i]);
        }
        System.out.println("Enter the length of 2nd array you want to made :- ");
        int len2 = input.nextInt();
        int[] arr2 = new int[len2];
        for(int i=0;i<len2;i++){
            arr2[i] = input.nextInt();
            all_no.add(arr2[i]);
        }
        ArrayList<Integer> intersection= new ArrayList<Integer>();
        for(int i=0;i<len1;i++){
            for(int j=0;j<len2;j++){
                if(arr1[i] == arr2[j]){
                    if(Collections.binarySearch(intersection,arr1[i])<0){
                        intersection.add(arr1[i]);
                    }
                }
            }
        }
        ArrayList<Integer> union = new ArrayList<Integer>();
        for(int i=0;i<len1;i++){
                if(Collections.binarySearch(union,arr1[i])<0){
                    union.add(arr1[i]);
            }
        }
        for(int j=0;j<len2;j++){
            if(Collections.binarySearch(union, arr2[j])<0){
                union.add(arr2[j]);
            }
        }
        Collections.sort(intersection);
        System.out.println("Intersection of arrays "+intersection);
        Collections.sort(union);
        System.out.println("Union of arrays "+union);
        input.close();
    }
}
