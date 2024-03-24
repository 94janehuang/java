import java.util.Scanner;

public class EXAM3_1 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int number = 0;
        System.out.print("請輸入一個奇數：");
        while (true) {
            number = scn.nextInt();
            if (number % 2 != 0 ){
                break;
            }
        }

        for(int i = 1 ; i <= number ; i++){
            for(int j = 1 ; j <= number ; j++){
                if( i==1 ||  j==1 || i==number || j==number){
                    System.out.print("Ｏ");
                }else if (i != (number + 1) / 2 && j != (number +1)/2){
                    System.out.print("Ｘ");
                }else {
                    System.out.print("　");
                }
            }
            System.out.println();
        }
    }
}