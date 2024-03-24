import java.util.Scanner;

public class EXAM4_1 {
    
    public static void main(String[] args){
        Scanner scn=new Scanner (System.in);
        System.out.print("請輸入一個西元年份：");
        int year =  scn.nextInt();

        for(int i=year-1 ; ; i--)
            if(i % 4 == 0 && i % 100 !=0 || i % 400 == 0) {
                System.out.print(i+"　");
                break;
        }

        for(int i=year+1 ; ; i++)
            if(i % 4 == 0 && i % 100 !=0 || i % 400 == 0) {
                System.out.print(i+"　");
                break;
        }
        
    }
}