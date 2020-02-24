package com.company;

public class Fish {
    private int numOfFins;
    private int numOfGulps;

    public void setNumOfFins(int numOfFins) {
        this.numOfFins = numOfFins;
    }

    public void setNumOfGulps(int numOfGulps) {
        this.numOfGulps= numOfGulps;
    }

    public int getNumOfFins() {
        return numOfFins;
    }

    public int getNumOfGulps() {
        return numOfGulps;
    }
    public Fish(int numOfGulps, int numOfFins) {
        this.numOfGulps = numOfGulps;
        this.numOfFins = numOfFins;
    }

}
