import java.util.Scanner;

public class ch6_2{
    public static void main(String[] args){ 
        Scanner scn=new Scanner(System.in);
        int sum=0;
        int[] months={31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.print("請輸入年分:");
            int year =  scn.nextInt();
        System.out.print("請輸入月份:");
            int month =  scn.nextInt();
        System.out.print("請輸入日期:");
            int day =  scn.nextInt();

        int leap_day = 0;

        //是不是閏年
        if(year % 4 == 0 && year % 100 !=0 || year % 400 == 0) {
            //是閏年
             leap_day = leap_day+1;
        }
        for(int i = 0; i < month -2; i++)
            sum = sum + months[i];
            if(month>2)
                sum = sum + leap_day;

        sum = sum+day; //當月已經有的天數

        System.out.printf("%d年%d月"+day+"日"+"，是一年之中的第%d天。", year, month ,sum);

    }
}