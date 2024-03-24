import java.util.Scanner;

public class project_1 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        double totalDistance = 0;

        for(i=1;i<=7;i++) {//每天累加加到第7天
            System.out.print("每天跑多少公里: ");
            double Distance = scanner.nextDouble();
            totalDistance += distance;
        }

        System.out.println("一周總距離:"+totalDistance+"公里");
        System.out.println("\n平均每天的距離:"+totalDistance/7+"公里");

        scn.close();
    }
}