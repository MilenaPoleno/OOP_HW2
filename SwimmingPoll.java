package ru.gb.lesson2.game;

public class SwimmingPoll {

    private final int distance;

    public SwimmingPoll(int distance) {
        this.distance = distance;
    }

    public boolean pass(CanSwim cansSwim) {
        return cansSwim.getSwim() >= distance;
    }
}
