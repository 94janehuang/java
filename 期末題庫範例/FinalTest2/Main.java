package FinalTest2;

public class Main {
    // 購買房子的函數
    public static void buy_house(Person person, House house) {
        if (person.getBankAccount().getBalance() >= house.getPrice()) {
            person.setHouse(house);
            person.getBankAccount().withdraw(house.getPrice());
            System.out.println(person.getName() + " 已購買房子位於 " + house.getAddress());
        } else {
            System.out.println(person.getName() + " 餘額不足，無法購買房子位於 " + house.getAddress());
        }
    }
    // 賣出房子的函數
    public static void sell_house(Person person) {
        if (person.getHouse() != null) {
            person.getBankAccount().deposit(person.getHouse().getPrice());
            System.out.println(person.getName() + " 已賣出房子位於 " + person.getHouse().getAddress() + "，獲得 " + person.getHouse().getPrice());
            person.setHouse(null);
        } else {
            System.out.println(person.getName() + " 沒有房子可以賣出");
        }
    }

    // 檢查是否有足夠的錢購買房子的函數
    public static boolean is_affordable(Person person, House house) {
        return person.getBankAccount().getBalance() >= house.getPrice();
    }
    public static void main(String[] args) {
        Person person = new Person("黃筱娟", 18);
        House house = new House("彰鹿路3段123號", 700000);
        BankAccount bankAccount = new BankAccount("123456789", 9000000);

        person.setHouse(house);
        person.setBankAccount(bankAccount);

        // 顯示信息
        System.out.println(person.getName() + " 擁有位於 " + person.getHouse().getAddress() + " 的房子，價值 " + person.getHouse().getPrice() + " 元。");
        System.out.println(person.getName() + " 的銀行帳戶號碼為 " + person.getBankAccount().getAccountNumber() + "，餘額為 " + person.getBankAccount().getBalance() + " 元。");
    }
}