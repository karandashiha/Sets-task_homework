package app.task2;

import java.util.HashSet;
import java.util.Set;

public class RemoveElement {
    public static void main(String[] args) {
        Set<String> fruits = createInitialData();
        System.out.println("Initial data:");
        printSet(fruits);

        removeElement(fruits, "kiwi");
        System.out.println("\nUpdated data:");
        printSet(fruits);
    }

    private static Set<String> createInitialData() {
        Set<String> fruits = new HashSet<>();
        fruits.add("orange");
        fruits.add("apple");
        fruits.add("kiwi");
        fruits.add("strawberry");
        fruits.add("mango");
        return fruits;
    }

    private static void removeElement(Set<String> data, String elementToRemove) {
        if (data.contains(elementToRemove)) {
            data.remove(elementToRemove);
        }
    }

    private static void printSet(Set<String> data) {
        int i = 1;
        for (String item : data) {
            System.out.println((i++) + ") " + item);
        }
    }
}
