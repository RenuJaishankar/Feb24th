package com.company;

public class Main {
    static void gulpChecker(int gulps){
        if (gulps >5){
            System.out.println("Your fish gulps a lot");
        } else {
            System.out.println("I think your fish is dead");
        }
    }
    static void featherChecker(int feathers){
        if (feathers >=24){
            System.out.println("The bird has enough feathers");
        } else {
            System.out.println("THe bird has less feathers");
        }
    }

    public static void main(String[] args) {
	// write your code here
        Fish myFish = new Fish(7,4);
        gulpChecker(myFish.getNumOfGulps());
        Bird myBird = new Bird(24,2);
        featherChecker(myBird.getNoOfFeather());

    }
}
