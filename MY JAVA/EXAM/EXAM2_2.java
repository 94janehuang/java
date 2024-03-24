import java.util.Scanner;

public class EXAM2_2 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);

        System.out.println("請輸入搭車公里數：");
            int sum=85;
            double km=scn.nextDouble();
            if(Math.floor((km-1.5)/0.3)>=1)
                sum += (5*Math.floor((km-1.5)/0.3));

        System.out.println("輸入時間(24小時制):");
            int clock=scn.nextInt();
                if(clock>=23 || clock<=6 )
                    sum +=(sum*0.2) ;

        System.out.println("車資總額是：$" + sum);
        
        scn.close();
    }   
}