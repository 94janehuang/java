import java.util.Scanner;

public class TEST2_1 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.print("請輸入第一個正整數：");
        int sum = 0 ;  //計算質數和
        int numA = scn.nextInt();
        System.out.print("請輸入第二個正整數：");
        int numB = scn.nextInt();
        System.out.print("二個正整數之間的質數為：");

        for(int i=numA;i<=numB;i++){
            boolean x = true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    x=false;
                    break;
                }
            }
            if(x){
                System.out.print(i + " ");
                sum = sum + i ;
            }
        }
        System.out.print("\n質數和為：" + sum);
        scn.close();
    }
}