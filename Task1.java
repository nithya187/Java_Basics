abstract class Animal {
   
    abstract void makeSound();
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }
}

class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Moo!");
    }
}

public class Task1 {
    public static void main(String[] args) {
        Dog D = new Dog();
        Cow C = new Cow();

        D.makeSound();
        C.makeSound();
    }
}
