// Question :-- Find a peak element which is not smaller than its neighbours
package array;
import java.util.Scanner;
public class Question1 {

    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the no of array you want to make");
        int no = input.nextInt();
        int[] arr = new int[no];
        for(int i=0;i<no;i++){
            int a = input.nextInt();
            arr[i] = a;
        }
        System.out.println("The required no. is :- ");
        for(int j=1;j<=no-2;j++){
            if((arr[j-1] < arr[j])&&(arr[j]>arr[j+1])){
                System.out.println(arr[j] +" ");
            }
        }
        input.close();
    }
}
