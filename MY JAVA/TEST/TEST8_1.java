import java.util.Scanner;

public class TEST8_1 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.print("請輸入銷售金額：");
        double salary=16895;
        double num=scn.nextDouble();
        if(num>=0 && num<=5000)
            salary += (num*0.1);
        if(num>=5001 && num<=10000)
         salary += (num*0.13);
        if(num>=10001 && num<=15000)
            salary += (num*0.16);
        if(num>=15001)
            salary  += (num*0.2);
        System.out.println("小明的薪水總額是：$" + salary);
        scn.close();
    }   
}
