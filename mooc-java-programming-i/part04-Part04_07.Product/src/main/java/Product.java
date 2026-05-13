/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdallah Fawzi
 */
public class Product {

    String initialName;
    double initialPrice;
    int initialQuantity;

    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.initialName = initialName;
        this.initialPrice = initialPrice;
        this.initialQuantity = initialQuantity;
    }

    public void printProduct() {
        System.out.println(initialName + ", price " + initialPrice + ", " + initialQuantity + "pcs");
    }
}
