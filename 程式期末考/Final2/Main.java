public class Main {
    public static void main (String[] args){
        Person person = new Person("people", 18);
        person.setHouse(new House("台北101", 100)) ;
        person.setBankAccount(new BankAccount("123456",99)) ;
        person.setCar(new Car("Toyota",10)) ;
        person.setPets(new Dog("Snoopy","yellow")) ;

        person.showAll();
    }

}
