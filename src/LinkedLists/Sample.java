package LinkedLists;

import java.util.LinkedList;

public class Sample {
    public static void main(String[] args) {
        // 1. Create a Linked List of Strings
        LinkedList<String> list = new LinkedList<>();

        // 2. Add elements (Append to the end)
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // 3. Add to specific positions
        list.addFirst("First Item"); // Inserts at the front
        list.addLast("Last Item");   // Inserts at the back

        // 4. Print the entire list
        System.out.println("Current List: " + list);

        // 5. Remove elements
        list.remove("Banana");       // Removes by value
        list.removeFirst();          // Removes the head

        // 6. Iterate through the list efficiently
        System.out.print("Iterating: ");
        for (String item : list) {
            System.out.print(item + " -> ");
        }
        System.out.println("null");
    }
}

