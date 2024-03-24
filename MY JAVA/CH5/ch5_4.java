import java.util.Scanner;

public class ch5_4 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int price = 500;
        double total = 0.0;

        System.out.print("請輸入購買商品的件數: ");
        int productNum = scn.nextInt();

        if(productNum>=10){
            total = productNum * price * 0.7;
        }else if (productNum>=5){
            total = productNum * price * 0.85;
        }else if (productNum>=3){
            total = productNum * price * 0.9;
        }else{
            total = productNum * price;
        } 
        System.out.println("總共是:"+total);

        scn.close();
    }
}
