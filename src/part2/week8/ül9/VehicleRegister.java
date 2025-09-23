package part2.week8.ül9;

import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;

    public boolean add(RegistrationPlate plate, String owner) {
        if (owners.containsKey(plate)) {
            return false;
        } else {
            owners.put(plate, owner);
            return true;
        }
    }

    public String get(RegistrationPlate plate) {
        return owners.get(plate);
    }

    public boolean delete(RegistrationPlate plate) {
        return owners.remove(plate) != null;
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate plate : owners.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        ArrayList<String> ownerNames = new ArrayList<>();
        for (String owner : owners.values()) {
            if (!ownerNames.contains(owner)) {
                ownerNames.add(owner);
            }
        }
        ownerNames.forEach(System.out::println);
    }
}
