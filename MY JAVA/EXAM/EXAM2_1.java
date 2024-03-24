import java.util.Scanner;

public class EXAM2_1 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);

        System.out.println("請輸入搭車公里數：");
            int sum=100;
            double km=scn.nextDouble();
            if(Math.floor((km-1.5)/0.5)>=1)
                sum += (7*Math.floor((km-1.5)/0.5));

        System.out.println("輸入am或pm");
            String time = scn.next();

        System.out.println("輸入時間");
            int clock=scn.nextInt();
                if(clock>=11 && time.equals("pm") || clock<=6 && time.equals("am"))
                    sum +=(sum*0.18) ;

        System.out.println("車資總額是：$" + sum);
        
        scn.close();
    }   
}