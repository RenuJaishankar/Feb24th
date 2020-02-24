package com.company;

public class Main {

    public static void main(String[] args) {
        //since string is an object,you can use a constructor to create a new instance of string.
        String myString = new String();
	// write your code here
        //constructing a new Car instance.
        Car newCar = new Car(4,4);
        //I can declare a car as an object but I won't be able tomuse the car fields or methods.
        Object otherCar = new Car(4,4);

        newCar.setNumOfSeats(2);
        //we use get because it is a private variable.
        System.out.println(newCar.getNumOfSeats());
    }
}
