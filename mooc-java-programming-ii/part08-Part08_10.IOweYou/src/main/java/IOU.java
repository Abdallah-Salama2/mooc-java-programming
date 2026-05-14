/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdallah Fawzi
 */
import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> directory;

    public IOU() {
        directory = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        directory.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return directory.getOrDefault(toWhom, 0.0);
    }
}
