package edu.neu.csye6200;

public class ServiceItemFactory {
    private static final ServiceItemFactory instance = new ServiceItemFactory();

    private ServiceItemFactory() {}

    public static ServiceItemFactory getInstance() {
        return instance;
    }

    public ServiceItem createItem(String csv) {
        return new ServiceItem(csv);
    }
}
