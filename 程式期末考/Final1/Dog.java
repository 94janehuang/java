public class Dog extends Pets {
    protected String name;
    protected String color;

    @Override
    public void sound() {
        System.out.println("旺");
    }
}