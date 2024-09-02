# Serialization in Java

Serialization in Java is the process of converting an object's state into a byte stream, so that the byte stream can be reverted back into a copy of the object.

## Key Concepts

- **Serializable Interface**: An object must implement the `Serializable` interface to be serialized.
- **SerialVersionUID**: It's a unique identifier for each `Serializable` class, used during the deserialization process to ensure that a loaded class corresponds exactly to a serialized object.

### Example: `SerializeObject.java`

The `SerializeObject.java` file demonstrates the basic use of serialization and deserialization in Java.

#### Serialization

1. **Create a Serializable Class**: Implement the `Serializable` interface.
    ```java
    class Person implements Serializable {
        private static final long serialVersionUID = 1L;
        private String name;
        private int age;
    }
    ```

2. **Serialize an Object**: Use `ObjectOutputStream` to write the object to a file.
    ```java
    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"));
    out.writeObject(person);
    out.close();
    ```

#### Deserialization

1. **Deserialize an Object**: Use `ObjectInputStream` to read the object from a file.
    ```java
    ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"));
    Person person = (Person) in.readObject();
    in.close();
    ```

### Summary

Serialization is a powerful feature in Java that allows for the easy saving and loading of objects. This is particularly useful in scenarios such as saving game states, caching, or sending objects over a network. The `SerializeObject.java` file provides a simple example of these concepts.


