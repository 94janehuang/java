import java.util.Scanner;
import java.util.Arrays;

public class TEST4_1 {
    
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int[] arr=new int[3];
        System.out.println("請輸入三個數字:");
        for(int i=0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("\n排序之後...");
        for (int i : arr){
            System.out.print(i+" ");
        }
    scn.close();
    }
}
