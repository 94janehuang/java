package FinalTest;

public class Bicycle extends Vehicle{
    public Bicycle(String brand) {  //建構子
        this.brand = brand;
    }

    @Override
    public void start() {
        System.out.println(brand + " 自行車開始騎行！");
    }

    @Override
    public void stop() {
        System.out.println(brand + " 自行車停止！");
    }
}