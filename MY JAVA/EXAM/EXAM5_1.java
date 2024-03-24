import java.util.Scanner;

public class EXAM5_1 {
    public int factorial (int number){
        int x = 1;
        for(int i=number; i!=0 ; i--){
            x = x*i;
        }
        return x;
    }

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        EXAM5_1 fac=new EXAM5_1();

        System.out.print("請輸入兩個小於10的正整數:");
        int x =  scn.nextInt();
        int y =  scn.nextInt();
        int suma = 1,sumb = 1,sum = 0,temp ;

        if(x<y){
            temp = y;
            y = x;
            x = temp ;
        }

        for(int i = x; i >= y ;i--){
            sum = sum + fac.factorial(i);
        }
     
        System.out.println("階乘和是:"+sum);
    }
}