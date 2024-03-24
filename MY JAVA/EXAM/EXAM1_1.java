import java.util.Scanner;

public class EXAM1_1 {
    
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int[] numbers =new int[4];

        System.out.println("請輸入四個整數:");
        for(int i=0;i<4;i++){
            numbers[i] = scn.nextInt();
        }

        for(int i = 0; i < numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]<numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println("由大到小的順序為:");
        for (int number : numbers){
            System.out.print(number+" ");
        }
        scn.close();
        }
    }