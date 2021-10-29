package com.konopackipio1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization {
    public static void main(String[] args) {
        Dog dog = new Dog("Ciapek", "Owczarek australijski", 20);
        dog.age = 5;

        System.out.println("Before serialization: \n" + dog);

        try {
            serializeObject(dog, "dog.ser");
            dog = (Dog) deserializeObject("dog.ser");
            // You can notice that Dog constructor won't be called, but parent class yes (which is not serializable)
            System.out.println("After serialization: \n" + dog);
        } catch (IOException e) {
            e.printStackTrace();
        }
        

    }


    public static void serializeObject(Object object, String fileName) throws FileNotFoundException, IOException {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            objectOutputStream.writeObject(object);
        } 
    }

    public static Object deserializeObject(String filename) throws FileNotFoundException, IOException {
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filename))) {
            return objectInputStream.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
    
}

abstract class Animal {
    int age;

    public Animal() {
        System.out.println("Inside animal no args constructor");

    }
}

class Dog extends Animal implements Serializable {
    private String name;
    private String breed;
    // this field won't be serialized
    private transient int weight;

    public Dog() {
        System.out.println("Inside no args constructor");
    }

    public Dog(String name, String breed, int weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        System.out.println("Inside dogs arguments constructor");
    }

    @Override
    public String toString() {
        return "Dog [weight=" + weight + ", breed=" + breed + ", name=" + name + ", age=" + age + "]";
    }


    // We override default methods to add super class fields to serialization
    // This is neeeded only when super class is not serializable    
    private void writeObject(ObjectOutputStream out) throws IOException{
        out.defaultWriteObject();
        out.writeInt(age);

    }    

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{
        in.defaultReadObject();
        age = in.readInt();
    }    

    
}
