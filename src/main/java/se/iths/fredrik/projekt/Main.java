package se.iths.fredrik.projekt;

public class Main {
    public static void main(String[] args) {
        String[] greeting = {"Hello", "world", "!"};
        printArray(greeting);
    }

    public static void printArray(String[] hello) {
        for (int i = 0; i < hello.length; i++) {
            System.out.println(hello[i]);
        }
    }
}