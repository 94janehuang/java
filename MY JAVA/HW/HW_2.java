import java.util.Scanner;

public class HW_2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
            int n,sum = 0,count = 0,max = 0,min = 100;

            do{
                System.out.print("請輸入成績: ");
                n = scn.nextInt();
                if(n!=-1){ // 如果 N 不等於 -1 的話 就執行下列
                    sum = sum + n; // 當每次輸入一個數時就把他加到sum這個總和裡面
                    count = count + 1; // 每當輸入一個數 數值就 +1
                    if(n>max){ // 當輸入的數值比max大 那數值就變成max
                        max = n;
                    }
                    if(n<min){ // 當輸入的數值比min大 那數值就變成min
                        min = n;
                    }
                }
            }while(n!=-1); // 當 n = -1 時 就跳出這個迴圈 
    
            System.out.printf("平均分數=%d",sum/count);
            System.out.printf("\n最高分=%d",max);
            System.out.printf("\n最低分=%d",min);

            scn.close();
    }
}