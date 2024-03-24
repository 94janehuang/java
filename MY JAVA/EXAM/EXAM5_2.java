import java.util.Scanner;

public class EXAM5_2 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);

        System.out.print("請輸入兩個小於10的正整數:");
        int x =  scn.nextInt();
        int y =  scn.nextInt();
        int suma = 1,sumb = 1;

        for(int i=x; i!=0 ; i--){
            suma = suma*i;
        }

        for(int i=y; i!=0 ; i--){
            sumb = sumb*i;
        }

        System.out.println("差距是:"+Math.abs(suma-sumb));
    }
}
