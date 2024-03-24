import java.util.Scanner;

public class TEST6_1 {

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.print("請輸入一個正整數(1~10)：");
        int sum=0 , num=scn.nextInt();
        for (int i=1;i<=100;i++)
            if(i%num==0)
                sum=sum+i;
        System.out.print("總和為："+ sum);

    scn.close();
    }
}
