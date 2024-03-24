import java.util.Scanner;

public class ch5_9 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

    System.out.print("請輸入一個數字: ");
    int num1 = scn.nextInt();

        for (int i=1;i<=num1;i++){
            for (int j=1;j<=num1;j++)
                if(i==num1 | i==1 | j==num1 | j==1 | i==j | i==j+1 | i==j+2 | i==j+3 | i==j+4 | i==j+5 | i==j+6 | i==j+7)
                    System.out.printf("*");
                else
                    System.out.printf(" ");

            System.out.println();

            scn.close();
        }
    }
}
