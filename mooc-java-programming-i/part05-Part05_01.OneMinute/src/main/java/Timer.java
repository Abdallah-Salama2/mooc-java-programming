/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdallah Fawzi
 */
public class Timer {

    private ClockHand hunderedthHand = new ClockHand(100);
    private ClockHand secondsHand = new ClockHand(60);

    public Timer() {
    }

    public void advance() {
        this.hunderedthHand.advance();
        if (this.hunderedthHand.value() == 0) {
            this.secondsHand.advance();
        }
    }

    @Override
    public String toString() {
        return this.secondsHand + ":" + this.hunderedthHand;
    }

}
