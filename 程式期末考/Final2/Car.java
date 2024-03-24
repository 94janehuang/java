class Car {
    private String brand;
    private double model;
    
    public Car(String brand, double model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand(){
        return brand;
    }

    public double getModel(){
        return model;
    }
}