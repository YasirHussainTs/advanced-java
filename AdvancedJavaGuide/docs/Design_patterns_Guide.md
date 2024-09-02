# Design Patterns in Java

Design patterns are standard solutions to common software design problems. They are templates designed to help you write code that is easy to understand and reuse.

## Common Design Patterns

### 1. Singleton Pattern

The Singleton pattern ensures that a class has only one instance and provides a global point of access to that instance.

#### Example: `SingletonPattern.java`

In the `SingletonPattern.java` file, the Singleton pattern is implemented as follows:

1. **Private Constructor**: The constructor is private to prevent instantiation.
    ```java
    private SingletonPattern() {
    }
    ```

2. **Static Instance**: A static instance of the class is created.
    ```java
    private static SingletonPattern instance;
    ```

3. **Public Method to Access the Instance**: The instance is accessed via a public static method.
    ```java
    public static SingletonPattern getInstance() {
        if (instance == null) {
            instance = new SingletonPattern();
        }
        return instance;
    }
    ```

### 2. Factory Pattern

The Factory pattern is used to create objects without specifying the exact class of object that will be created.

#### Example: `FactoryPattern.java`

To implement the Factory pattern:

1. **Create a Factory Class**: The factory class contains a method that returns an instance of the desired object.
    ```java
    public class ShapeFactory {
        public Shape getShape(String shapeType) {
            if (shapeType.equalsIgnoreCase("CIRCLE")) {
                return new Circle();
            } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
                return new Rectangle();
            }
            return null;
        }
    }
    ```

2. **Use the Factory**: The client code uses the factory to create instances of objects.
    ```java
    ShapeFactory shapeFactory = new ShapeFactory();
    Shape shape = shapeFactory.getShape("CIRCLE");
    shape.draw();
    ```

### 3. Observer Pattern

The Observer pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified.

#### Example: `ObserverPattern.java`

To implement the Observer pattern:

1. **Create Observer and Subject Interfaces**: Define interfaces for observers to implement.
    ```java
    public interface Observer {
        void update();
    }
    
    public interface Subject {
        void attach(Observer observer);
        void detach(Observer observer);
        void notifyObservers();
    }
    ```

2. **Implement the Concrete Subject**: The subject maintains a list of observers.
    ```java
    public class ConcreteSubject implements Subject {
        private List<Observer> observers = new ArrayList<>();
        
        public void attach(Observer observer) {
            observers.add(observer);
        }
        
        public void detach(Observer observer) {
            observers.remove(observer);
        }
        
        public void notifyObservers() {
            for (Observer observer : observers) {
                observer.update();
            }
        }
    }
    ```

3. **Implement the Concrete Observer**: The observers implement the update method.
    ```java
    public class ConcreteObserver implements Observer {
        public void update() {
            System.out.println("Observer has been updated!");
        }
    }
    ```

### Summary

Design patterns provide a proven approach to solving common problems in software design. The examples in this project demonstrate how to implement some of the most widely used patterns in Java.


