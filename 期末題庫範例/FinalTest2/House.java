package FinalTest2;

class House {
    private String address;
    private double price;

    public House(String address, double price) {
        this.address = address;
        this.price = price;
    }

    // 其他 getter 方法
    public String getAddress() {
        return address;
    }

    public double getPrice() {
        return price;
    }
}