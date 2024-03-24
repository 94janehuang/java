package FinalTest;

import java.util.ArrayList;
import java.util.Scanner;

// 以此類別來做文字選單，以及管理交通工具的動作！
public class VehicleManager {
    //以Vehicle類別之物件來建立 ArrayList
    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle v) {
        //add為 ArrayList 之方法，可以增加ArrayList裡的內容
        //這裡指的就是放入一個 Vehicle類別所實體化的物件v
        vehicles.add(v);
    }

    public void showMenu() { //文字選單的設計
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. 添加新的交通工具");
            System.out.println("2. 顯示所有交通工具");
            System.out.println("3. 起動特定交通工具");
            System.out.println("4. 停止特定交通工具");
            System.out.println("5. 退出");
            System.out.print("請輸入選項：");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addNewVehicle(scanner);
                    break;
                case 2:
                    displayVehicles();
                    break;
                case 3:
                    operateVehicle(scanner, true);
                    break;
                case 4:
                    operateVehicle(scanner, false);
                    break;
                case 5:
                    System.out.println("退出系統");
                    break;
                default:
                    System.out.println("無效的選項");
            }
        } while (choice != 5); //沒有選5退出就持續做文字選單的動作
    }

    private void addNewVehicle(Scanner scanner) {
        System.out.print("請選擇要添加的交通工具類型（Car/Bicycle）：");
        String type = scanner.next();
        System.out.print("請輸入品牌：");
        String brand = scanner.next();

        if (type.equalsIgnoreCase("Car")) { //判斷不論大小寫的字串是否等於 car 的語法
            addVehicle(new Car(brand));
        } else if (type.equalsIgnoreCase("Bicycle")) { //判斷不論大小寫的字串是否等於 bicyle 的語法
            addVehicle(new Bicycle(brand));
        } else {
            System.out.println("無效的類型！");
        }
    }

    private void displayVehicles() {    //如果不為空，則顯示ArrayList裡的所有元素
        if (vehicles.isEmpty()) {
            System.out.println("沒有任何交通工具！");
        } else {
            for (int i = 0; i < vehicles.size(); i++) {
                System.out.println((i + 1) + ". " + vehicles.get(i).brand);
            }
        }
    }

    private void operateVehicle(Scanner scanner, boolean start) {
        displayVehicles();
        System.out.print("請選擇要操作的交通工具編號：");
        int index = scanner.nextInt();

        if (index < 1 || index > vehicles.size()) {
            System.out.println("無效的編號！");
        } else {
            Vehicle selected = vehicles.get(index - 1);//被選到的交通工具
            if (start) {
                selected.start();
            } else {
                selected.stop();
            }
        }
    }

//主程式執行文字選單，直至選5才會退出系統
    public static void main(String[] args) {
        VehicleManager manager = new VehicleManager();
        manager.showMenu();
    }
}
