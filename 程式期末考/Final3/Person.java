class Person {
    private String name;
    private int age;
    private House house;
    private BankAccount bankAccount;
    private Car car;
    private Pets pet;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void setHouse(House house) {
        this.house = house;
    }
    
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void setCar(Car car) {
        this.car = car;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public House getHouse() {
        return house;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }
    
    public Car getCar() {
        return car;
    }

    public void showAll(){
        System.out.println(house.getAddress());
        System.out.println(bankAccount.getAccountNumber());
        System.out.println(car.getBrand());
        System.out.println(pet.getName());
    }
}