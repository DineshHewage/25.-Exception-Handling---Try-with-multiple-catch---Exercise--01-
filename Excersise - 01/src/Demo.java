/*
Exercise 1: Handling ArithmeticException and NullPointerException
Write a Java program that:

Declares two integer variables, a and b, where a = 0 and b = 20.
Attempts to divide b by a inside a try block to trigger an ArithmeticException.
Declares a String variable str but does not initialize it, then attempts to print str.length() inside the try block to trigger a NullPointerException.
Uses multiple catch blocks to handle ArithmeticException and NullPointerException separately, printing a unique message for each exception.

Expected Output:
If an ArithmeticException occurs, print a message like:
ArithmeticException: Cannot divide by zero

If a NullPointerException occurs, print a message like:
NullPointerException: String is not initialized

 */



public class Demo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String str = null;

        try {
            b = b/a;
            str.length();
        }catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by zero");
        }catch (NullPointerException e){
            System.out.println("NullPointerException: String is not initialized");
        }catch (Exception e){
            System.out.println("Exception: General");
        }
    }
}
