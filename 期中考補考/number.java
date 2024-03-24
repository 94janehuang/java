import java.util.Scanner;
public class number{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        for(int i=1; i<=x ;i++){
            int num1 = scn.nextInt();
            int num2 = scn.nextInt();
            int num3 = scn.nextInt();
            int num4 = scn.nextInt();
            int num5;
            if(num2-num1==num3-num2){
                num5 = num4+(num3-num2);
                System.out.println(num1+" "+num2+" "+num3+" "+num4+" "+num5);
            }
            if(num2/num1==num3/num2){
                num5 = num4*(num3/num2);
                System.out.println(num1+" "+num2+" "+num3+" "+num4+" "+num5);
            }
        }
    scn.close();
    }
}