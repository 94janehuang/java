import java.util.Scanner;

public class HW_3 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int price = 290; //每本290元
        double total = 0.0;

        System.out.print("請輸入購買商品的件數: ");
        int productNum = scn.nextInt();

        if(productNum>=7){ //7本書以上打8折
            total = productNum * price * 0.8;
        }else if (productNum>=5){ //5本書打85折
            total = productNum * price * 0.85;
        }else if (productNum>=3){ //3本書打9折
            total = productNum * price * 0.9;
        }else{
            total = productNum * price;
        } 
        System.out.println("總共是:"+total);

        scn.close();
    }
}