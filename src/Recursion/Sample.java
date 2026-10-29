package Recursion;

public class Sample {

    public static void countDown(int n) {
        // 1. Base Case: Stop when n hits 0
        if (n == 0) {
            return;
        }

        // 2. Action: Print the current number
        System.out.println(n);

        // 3. Recursive Case: Call the method again with n - 1
        countDown(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Starting countdown:");
        countDown(5); // Output: 5, 4, 3, 2, 1
    }
}

