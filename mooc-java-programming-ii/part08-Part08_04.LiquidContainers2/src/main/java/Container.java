/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdallah Fawzi
 */
public class Container {

    private int amount;

    public Container() {
    }

    public int contains() {
        return this.amount;
    }

    public void add(int amount) {

        this.amount = (amount > 0) ? (this.amount + amount) > 100 ? 100 : this.amount + amount : this.amount;
    }

    public void remove(int amount) {
        if (amount > 0) {
            this.amount = (this.amount - amount) > 0 ? (this.amount - amount) : 0;
        }
    }

    @Override
    public String toString() {
        return this.amount + "/100";
    }

}
