package com.company;

public class Car {
    //typically,you want your fieldsmin a class to be private

    private int numOfWheels;
            private int numOfSeats;

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }


    //constructors do not have access type or a return type
    //In Java you simply declare a name of the class

    Car(int numOfWheels , int numOfSeats ){
        setNumOfSeats(numOfSeats);
        setNumOfWheels(numOfWheels);
    }


}
