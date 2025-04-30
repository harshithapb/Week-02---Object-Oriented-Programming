package AssistedProblems;
import java.util.*;
public class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Animal makes sound");
    }

    void display() {
        System.out.println("Name :" + name + " age : " + age);
    }
    public static void main(String[] args){
        Animal animal=new Animal("ANIMAL",12);
        animal.display();
        animal.makeSound();

        Dog dog=new Dog("PUPPY",12);
        dog.display();
        dog.makeSound();

        Cat cat=new Cat("kitten",13);
        cat.display();
        cat.makeSound();

        Bird bird= new Bird("bird",6);
        bird.display();
        bird.makeSound();

    }
}

    class Dog extends Animal{
        Dog(String name,int age){
            super(name,age);
        }
        @Override
        void makeSound(){
            System.out.println("Dog barks");
        }
    }
    class Cat extends Animal{
        Cat(String name,int age){
            super(name,age);
        }
        @Override
        void makeSound(){
            System.out.println("Cat meows");
        }
    }
    class Bird extends Animal{
        Bird(String name,int age){
            super(name, age);
        }
        @Override
        void makeSound(){
            System.out.println("Bird chirps");
        }
    }



