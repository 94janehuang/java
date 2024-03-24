public class HW_1 {
    public static void main(String[] args){

        int i,sum = 0; //i為累加天數 sum為金額總和

        for(i=1;i<=365;i++) //每天加10元加到第365天
           sum=sum+10;
        System.out.printf("經過365天后一共存了%d元",sum);

        for(i=1,sum=10;sum<=5000;i++) //每天加10元 看加到第幾天的時候可以超過5000
            sum=sum+10;
        System.out.printf("\n經過%d天可以存超過5000元",i);
        }
    }
