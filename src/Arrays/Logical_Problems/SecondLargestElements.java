package Arrays.Logical_Problems;

public class SecondLargestElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,57,6,100,89,90,7};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int n : arr) {
            if(n > largest) {
                secondLargest = largest;
                largest = n;
            }
            else if(n > secondLargest){
                secondLargest = n;
            }
        }
        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }
}
