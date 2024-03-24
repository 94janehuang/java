import java.util.Scanner;

public class EXAM6_1 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);

        int[] denominations = {500,100,50,10,5,1};

        System.out.print("請輸入找零金額(1-1000):");
        int change = scn.nextInt();

        if (change < 1 | change > 1000){
            System.out.println("輸入的金額不再有效範圍內!");
            return;
        }

        System.out.println("找零金額"+ change + "可以分為:");

        for (int denomination : denominations ){
            if (change >= denomination){
                int count = change / denomination;
                change %= denomination;
                System.out.println(denomination + "元" + count + "個");
            }
        }
        scn.close();
    }
}
