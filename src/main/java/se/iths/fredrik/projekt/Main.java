package se.iths.fredrik.projekt;

public class Main {
    public static void main(String[] args) {
        String[] greeting = {"Hello", "world", "!"};
        printArray(greeting);
    }

    public static void printArray(String[] hello) {
        for (String i : hello) {
            System.out.println(i);
        }
    }
}