public class Animal
{
   
abstract class Animal {
  constructor(public name: string) {}
  
  abstract makeSound(): void;
}

class Dog extends Animal {
  makeSound() {
    console.log(`${this.name} 汪汪汪！`);
  }
}

class Cat extends Animal {
  makeSound() {
    console.log(`${this.name} 喵喵喵！`);
  }
}

let dog = new Dog("旺財");
let cat = new Cat("咪咪");

dog.makeSound(); 
cat.makeSound(); 

}
