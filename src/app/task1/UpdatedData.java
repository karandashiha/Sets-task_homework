package app.task1;

import java.util.HashSet;
import java.util.Set;

public class UpdatedData {
    public static void main(String[] args) {

        Set<String> fruits = createInitialData();
        System.out.println("Initial data:");
        printSet(fruits);

        updateData(fruits);
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

    private static void updateData(Set<String> data) {
        data.add("grape");
        data.remove("strawberry");
    }

    private static void printSet(Set<String> data) {
        int i = 1;
        for (String item : data) {
            System.out.println((i++) + ") " + item);
        }
    }
}
