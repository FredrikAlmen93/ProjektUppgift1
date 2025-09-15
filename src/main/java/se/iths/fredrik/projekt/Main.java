package se.iths.fredrik.projekt;

public class Main {
    public static void main(String[] args) {
        //Print Array iterations, one at a time
        String[] greeting = {"Hello", "world", "!"};
        printArray(greeting);

        //Print max number from Array
        int[] numbers = {1, 10, 15, 20, 3, 44, 51, 40};
        System.out.println("The max number of the array is: " + findMax(numbers));
    }

    //ARRAY PRINTER
    public static void printArray(String[] hello) {
        for (String i : hello) {
            System.out.println(i);
        }
    }

    //MAX NUMBER FINDER
    public static int findMax(int[] maxArray) {
        int max = maxArray[0];
        for (int i = 0; i < maxArray.length; i++) {
            if (maxArray[i] > max) {
                max = maxArray[i];
            }
        }
        return max;
    }
}