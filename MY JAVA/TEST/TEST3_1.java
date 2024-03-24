import java.util.Scanner;

public class TEST3_1 {
    public static void main(String[] args){
        Scanner scn=new Scanner (System.in);
        System.out.print("請輸入第一個西元年：");
        int sum = 0 ;
        int y1 = scn.nextInt();
        System.out.print("請輸入第二個西元年：");
        int y2 = scn.nextInt();
        System.out.println("二個年份之間的閏年為：");
        for (int i=y1;i<=y2;i++){
            if (i%4==0 && i%100!=0 | i%400==0){
                System.out.println(i+"年為閏年");
                sum=sum+1;
            }
        }
        System.out.print("共有" + sum + "個閏年") ;
        scn.close();
    }
}

