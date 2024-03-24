import java.util.Scanner;

public class TEST5 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);

        int[] cashes = {500,100,50,10,5,1};


        System.out.print("請輸入金額(1-1000):");
        int change = scn.nextInt();

    
        if (change < 1 || change > 1000){       //判斷金額是否符合
            System.out.println("輸入的金額不符合!");
                return;
        }
        
       System.out.println("找零金額"+ change + "可以分為:");

       for (int cash : cashes ){
            if (change >= cash){
                int count = change / cash;
                change %= cash;
                System.out.println(cash + "元" + count + "個");
            }
        }
        scn.close();
    } 
}