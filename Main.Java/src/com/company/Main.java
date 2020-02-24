package com.company;
//classes are PascalCase instead of camelCase
//Capitalized in Java will typically refer to a class.
public class Main {
   static void animalChecker(Animal a){
       if ( a instanceof Animal) {
         System.out.println(a.speak());
           System.out.println(a);
       }
       else {
           System.out.println("This is not an animal");
       }
    }
    //lets break down what this all means
    //public is an access modifier,it allows other programs to see main.
    //static means the method or variable is of the class and not of the instance.
    //void means that this method does not return anything.
    //main tells Java that this method is your entry point
    //String args[] is the parameter of your main method.
    public static void main(String[] args) {

        //Java is camel case
	// note the lack of "println" and the \n notation to create a line break
        Cat garfield = new Cat();
        Dog brian = new Dog();
        Animal myAnimal = new Animal();

        animalChecker(brian);
        boolean animal;


        System.out.print("Hello World! \n");
        System.out.print("My name is Renu.\n");
        //formatting in Java,note that the s refers to string
        System.out.printf("My name is %s","Renu");

        //this is primitive,t's a direct access to a datum value.no pointer
        //one important thing to note is that Java is strictly typed.
        //variables can be reassigned but only to their given type
        int x=4;
        //Integer is a class for int that has helper methods.This is what we called a wrapper class
        Integer y=4;
        System.out.println(y.toString());
        //here are all the data types for java
        //byte, small data type that takes up to 8 bits.
        //short, small number thats up to 16 bits.
        //int, most commonly used primitive that takes up 32 bits
        //long data type for large numbers that takes up 64 bits/
        //double data type for very long decimal value that takes up 64 bits
        //char,data types for character that take up 16 bits.
        //boolean data type for checking true/false that takes up 1 bit.
      //this is a reference.It's a pointer to another location in memory that represents the given value
        String str = "This is a string";
        //class , which is the basic OOP building block of Java
        //Anotation, which provides metadata
        //Array ,fixed data structure that store elements of the same type
        //Enumeration, a reference for a set of objects that represent a related set of choices.
        //Interface, provides a public API that is implemented by classes.
        //variable in an object is called a fiels.
        //function in an object is called method
        //imports in a program called java.utilscanner
//        System.out.println("what is you name?");
//        String firstName = input.nextLine();
//        System.out.printf("Hello %s \n",firstName);
        //mad libs assignment
//        System.out.println("Input a noun: ");
//        String noun = input.nextLine();
//        System.out.println("Input an adjective:");
//        String adj = input.nextLine();
//        System.out.println("Input a verb:");
//        String verb = input.nextLine();
//        System.out.printf("The %s %s likes to %s",adj,noun,verb);

        //operators
        //we have *, /, +, -, and % (modulos)
        //comparison symbols =, != , < , <=, >, >=
//        int num=2;
//        int z = 2 + num;
//        //the following syntax works with most major operators
//        //note the ++ syntax is basically means plus 1
//        int a = num++;
//        //note the =+ syntax , this means b= b + num
//        int b =+num;
//
//        //modular syntax checks for the remainder of the division of two values.
//        int c=10%5;  //c should return 0
//        System.out.println(c);
//        if(c == 0){
//            System.out.println("There is no remainder");
//        }




        }

    }

