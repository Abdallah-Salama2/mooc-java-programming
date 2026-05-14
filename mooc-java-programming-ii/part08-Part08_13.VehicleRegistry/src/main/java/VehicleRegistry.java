
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Abdallah Fawzi
 */
public class VehicleRegistry {

    HashMap<LicensePlate, String> plates;

    public VehicleRegistry() {
        this.plates = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.plates.containsKey(licensePlate)) {
            return false;
        }
        this.plates.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        return this.plates.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.plates.containsKey(licensePlate)) {
            this.plates.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate plate : this.plates.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        // استخدام HashSet يمنع تكرار الأسماء تلقائياً وبكفاءة أعلى
        HashSet<String> printedOwners = new HashSet<>(this.plates.values());
        for (String owner : printedOwners) {
            System.out.println(owner);
        }
    }
}
