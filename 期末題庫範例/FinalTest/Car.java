package FinalTest;

public class Car extends Vehicle {
    public Car(String brand) {  //建構子
        this.brand = brand;
    }

    @Override
    public void start() {
        System.out.println(brand + " 汽車啟動！");
    }

    @Override
    public void stop() {
        System.out.println(brand + " 汽車停止！");
    }
    
}
