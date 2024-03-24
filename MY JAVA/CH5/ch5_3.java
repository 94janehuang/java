import java.util.Scanner;

public class ch5_3 {
    public static void main(String[] args){
      Scanner scn = new Scanner(System.in);

      System.out.print("請輸入第一個整數: ");
      int num1 = scn.nextInt();

      System.out.print("請輸入第二個整數: ");
      int num2 = scn.nextInt();

      if (num1>num2)
          System.out.println(num1+"大於"+num2);
      else if (num1<num2)
          System.out.println(num1+"小於"+num2);
      else
          System.out.println(num1+"等於"+num2);
    
    scn.close();
    }
}
