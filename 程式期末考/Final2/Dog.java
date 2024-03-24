public class Dog extends Pets {
    protected String name;
    protected String color;

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName(){
        return name;
    }

    public String getColor(){
        return color;
    }

    @Override
    public void sound() {
        System.out.println("旺");
    }
}