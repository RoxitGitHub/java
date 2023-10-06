package assigment;

//Step 1: Create a superclass (parent class)
class Animal {
 public void makeSound() {
     System.out.println("Animal makes a sound");
 }
}

//Step 2: Create subclasses (child classes) that inherit from the superclass
class Dog extends Animal {
 @Override
 public void makeSound() {
     System.out.println("Dog barks");
 }
}

class Cat extends Animal {
 @Override
 public void makeSound() {
     System.out.println("Cat meows");
 }
}

//Step 3: Create a main class to demonstrate polymorphism
public class polymorphismExample {
 public static void main(String[] args) {
     Animal myAnimal = new Animal();
     Animal myDog = new Dog();
     Animal myCat = new Cat();

     // Polymorphism in action
     myAnimal.makeSound(); // Calls the makeSound method of the Animal class
     myDog.makeSound();    // Calls the makeSound method of the Dog class
     myCat.makeSound();    // Calls the makeSound method of the Cat class
 }
}