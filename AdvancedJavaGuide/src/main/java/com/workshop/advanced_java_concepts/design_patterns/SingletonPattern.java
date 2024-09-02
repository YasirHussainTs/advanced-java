package com.workshop.advanced_java_concepts.design_patterns;

public class SingletonPattern {

    // Private static variable of the single instance
    private static SingletonPattern instance;

    // Private constructor to prevent instantiation
    private SingletonPattern() {
    }

    // Public method to provide access to the single instance
    public static SingletonPattern getInstance() {
        if (instance == null) {
            instance = new SingletonPattern();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello, I am a Singleton!");
    }

    public static void main(String[] args) {
        // Get the only object available
        SingletonPattern singleton = SingletonPattern.getInstance();
        singleton.showMessage();
    }
}

