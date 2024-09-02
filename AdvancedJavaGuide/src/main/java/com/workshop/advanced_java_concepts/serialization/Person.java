package com.workshop.advanced_java_concepts.serialization;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class SerializeObject {

    public static void main(String[] args) {
        Person person = new Person("Yasir Hussain Ts", 30);
        String filename = "person.ser";

        // Serialize the object
        try (FileOutputStream fileOut = new FileOutputStream(filename);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(person);
            System.out.println("Serialized data is saved in " + filename);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Deserialize the object
        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            Person deserializedPerson = (Person) in.readObject();
            System.out.println("Deserialized Person: " + deserializedPerson);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

