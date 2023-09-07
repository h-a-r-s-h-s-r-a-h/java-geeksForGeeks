// Question.13 :- Find common elements in three sorted arrays;
package array;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Question13g {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of 1st array u want to make :-");
        int len1 = input.nextInt();
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        System.out.println("Enter the elements of 1st array :-");
        for(int i=0;i<len1;i++){
            int a = input.nextInt();
            arr1.add(a);
        }
        System.out.println("Enter the length of 2nd array u want to make :-");
        int len2 = input.nextInt();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        System.out.println("Enter the elements of 2nd array :-");
        for(int i=0;i<len2;i++){
            int b = input.nextInt();
            arr2.add(b);
        }
        System.out.println("Enter the length of 3rd array u want to make :-");
        int len3 = input.nextInt();
        ArrayList<Integer> arr3 = new ArrayList<Integer>();
        System.out.println("Enter the elements of 3rd array :-");
        for(int i=0;i<len3;i++){
            int c = input.nextInt();
            arr3.add(c);
        }

        ArrayList<Integer> final_array = new ArrayList<Integer>();
        for(int i=0;i<len1;i++){
            for(int j=0;j<len2;j++){
                if(arr1.get(i)==arr2.get(j)){
                    for(int k=0;k<len3;k++){
                        if(arr1.get(i)==arr3.get(k)){
                            final_array.add(arr1.get(i));
                        }
                    }
                }
            }
        }
        int len4 = final_array.size();
        ArrayList<Integer> final_array1 = new ArrayList<Integer>();
        for(int i=0;i<len4;i++){
            for(int j=i+1;j<len4;j++){
                if(final_array.get(i)==final_array.get(j)){
                    if(Collections.binarySearch(final_array1,final_array.get(i))<0){
                        final_array1.add(final_array.get(i));
                    }
                }
            }
        }
        System.out.println(final_array1);
        input.close();
    }
}
