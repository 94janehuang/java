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

    public void setHouse(House house){
        this.house = house;
    }

    public void setBankAccount(BankAccount bankaccount){
        this.bankAccount = bankaccount;
    }

    public void setCar(Car car){
        this.car = car;
    }

    public void setPets(Pets pet){
        this.pet = pet;
    }

    public void showAll(){
        System.out.println(house.getAddress());
        System.out.println(bankAccount.getAccountNumber());
        System.out.println(car.getBrand());
        System.out.println(pet.getName());
    }
}