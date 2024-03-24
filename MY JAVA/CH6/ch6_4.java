import java.util.Scanner;

public class ch6_4{
    public static void main(String[] args){
        System.out.println("請輸入一個數字");
        Scanner Keyin=new Scanner(System.in);
        int numA = Keyin.nextInt();
        int [][] arrTable = new int[numA][numA];//變化的方式決定陣列的大小

        for (int row=0 ; row<arrTable.length ; row++){
            for (int col=0 ; col<arrTable[row].length ; col++){
                arrTable[row][col] = (row+1)*(col+1);
                System.out.printf("%3d", arrTable[row][col]);
            }
            System.out.println();
        }
        Keyin.close();
    }
}