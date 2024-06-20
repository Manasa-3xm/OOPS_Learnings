package org.example.exception;

public class Try_Catch {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Arrays Index is out of bounds !");
        } finally {
            //regardless the exception or not finally gets executed.
            System.out.println("finally block is always executed ");
        }
    }
}
