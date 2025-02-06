package edu.neu.csye6200;

public class ElectronicItemFactory {
    private static ElectronicItemFactory instance;

    private ElectronicItemFactory() {}

    public static ElectronicItemFactory getInstance() {
        if (instance == null) {
            instance = new ElectronicItemFactory();
        }
        return instance;
    }

    public ElectronicItem createItem(String csv) {
        return new ElectronicItem(csv);
    }
}
