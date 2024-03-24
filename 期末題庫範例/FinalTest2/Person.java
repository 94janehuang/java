package FinalTest2;

class Person {
    private String name;
    private int age;
    private House house;
    private BankAccount bankAccount;

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

    // 其他 getter 方法
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
}