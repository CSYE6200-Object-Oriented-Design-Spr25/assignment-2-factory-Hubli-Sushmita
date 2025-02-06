package edu.neu.csye6200;

public class ServiceItem extends Item {
    public ServiceItem(String csv) {
        super(Integer.parseInt(csv.split(",")[0]), csv.split(",")[1],
                Double.parseDouble(csv.split(",")[2]), csv.split(",")[3]);
    }
}
