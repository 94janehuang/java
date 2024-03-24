import java.util.Scanner;

public class TEST4 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int number = 0;
        System.out.println("請輸入一個奇數:");
    
        while (true) {
            number = scn.nextInt();
            if (number % 2 != 0 ){      //判斷使用者輸入的樹是否為奇數
                break;
            }
            System.out.println("請輸入一個奇數:");  //若不是奇數則再請使用者輸入一次
        }

        for(int i = 1 ; i <= number ; i++){
            for(int j = 1 ; j <= number ; j++){
                if( i==1 ||  j==1 || i==number || j==number){       //印出最外圍一圈框框為O
                    System.out.print("Ｏ");
                }else if (i != (number + 1) / 2 && j != (number +1)/2){     //若i跟j不等於使用者輸入的數字加1除以2就印出X
                    System.out.print("Ｘ");
                }else {
                    System.out.print("　");      //若非上述的條間則印出空白
                }
            }
            System.out.println();
        }
        scn.close();
    }
}


