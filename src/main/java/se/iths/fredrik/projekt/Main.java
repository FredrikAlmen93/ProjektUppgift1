package se.iths.fredrik.projekt;

public class Main {
    public static void main(String[] args) {
        //PRINT ARRAY INDEXES ONE AT A TIME
        String[] greeting = {"Hello", "world", "!"};
        printArray(greeting);

        //PRINT MAX NUMBER FROM ARRAY
        int[] numbers = {1, 10, 15, 20, 3, 44, 51, 40};
        System.out.println("The max number of the array is: " + findMax(numbers));

        //RETURN BIGGEST DOUBLE VALUE
        System.out.println("Biggest number: " + findBiggest(9.3, 9.1));

        //NAME PRINTER
        namePrinter("Fredrik", "Almen");
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

    //BIGGEST DOUBLE VALUE
    public static double findBiggest(double num1, double num2) {
        return (num1 > num2) ? num1 : num2;
    }

    //FIRST/LAST-NAME PRINTER
    public static void namePrinter(String fName, String lName) {
        System.out.println(fName + " " + lName);
    }
}