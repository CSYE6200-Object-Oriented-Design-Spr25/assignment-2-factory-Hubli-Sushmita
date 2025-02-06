package edu.neu.csye6200;

import java.util.List;

import java.util.*;

public class Store extends AbstractStore {

    public void demo() {
        List<Item> items = new ArrayList<>();

        for (String line : FileUtil.readCSV("FoodItemCSV.txt")) {
            System.out.println("Adding item: " + line);  // Debug line
            items.add(FoodItemFactory.createItem(line));
        }

        // Check if items list is populated
        System.out.println("Total items added: " + items.size());
        if (items.isEmpty()) {
            System.out.println("No items were added!");
        }

        ElectronicItemFactory electronicFactory = ElectronicItemFactory.getInstance();
        for (String line : FileUtil.readCSV("ElectronicItemCSV.txt")) {
            System.out.println("Adding electronic item: " + line);  // Debug line
            items.add(electronicFactory.createItem(line));
        }

        ServiceItemFactory serviceFactory = ServiceItemFactory.getInstance();
        for (String line : FileUtil.readCSV("ServiceItemCSV.txt")) {
            System.out.println("Adding service item: " + line);  // Debug line
            items.add(serviceFactory.createItem(line));
        }

        System.out.println("\nSorted by ID:");
        items.stream().sorted(Comparator.comparingInt(Item::getId)).forEach(System.out::println);

        System.out.println("\nSorted by Name:");
        items.stream().sorted(Comparator.comparing(Item::getName)).forEach(System.out::println);

        System.out.println("\nSorted by Price:");
        items.stream().sorted(Comparator.comparingDouble(Item::getPrice)).forEach(System.out::println);
    }

}
