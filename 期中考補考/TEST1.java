import java.util.Scanner;

public class TEST1 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);

        System.out.println("請輸入搭車公里數");
            int sum=85;   //設定加總sum的初始金額為85元
            double km=scn.nextDouble();
            if(Math.floor((km-1.5)/0.3)>=1)     //用使用者輸入的公里數減去1.5(公里)，看剩下多少公里，再去除以0.3，可以得知剩下幾個0.3(公里)
                sum += (5*Math.floor((km-1.5)/0.3));        //知道剩下幾個0.3公里後，去*5，即可得知sum初始金額需要再加多少即為該付款車資

        System.out.println("輸入上車時間(24小時制):");
            int clock=scn.nextInt();
                if(clock>=23 || clock<=6 )      //判斷時間是否大於23點或小於6點
                    sum +=(sum*0.2) ;       //諾是時間大於23點或小於6點就讓付款車資*0.2

        System.out.println("車資總額是：$" + sum);
        
        scn.close();
    }
}