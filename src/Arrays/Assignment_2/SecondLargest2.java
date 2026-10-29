package Arrays.Assignment_2;
import java.util.Scanner;
public class SecondLargest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 10;
        long[] arr = new long[max];
        long n = sc.nextLong();
        int i = 0;
        while(n>0) {
            arr[i++] = n % 10;
            n /= 10;
            if(i == 10) {
                max += 10;
                long[] temp = new long[max];
                for(int k = 0;k < i;k++) {
                    temp[k] = arr[k];
                }
                arr = temp;
            }
        }
        long largest = 0;
        long secondlargest = 0;
        for(int j = 0;j < max;j++) {
            if(largest < arr[j]) {
                secondlargest = largest;
                largest = arr[j];
            } else if(secondlargest <  arr[j] && arr[j] != largest) {
                secondlargest = arr[j];
            }
        }
        System.out.println("Largest element : " + largest);
        System.out.println("Second Largest element : " + secondlargest);
    }
}
