package com.syonet;

import java.util.Arrays;
import java.util.Random;

public final class App {

    public static void main(String[] args) {
        System.out.println(greeting("Frederico!"));
        System.out.println(sum(1F, 2F));
        String[] cars = {"Gol", "Uno", "Astra", "Vectra"};
        System.out.println(randomStringFromGivenArray(cars));
        System.out.println(Arrays.toString(args));
    }

    public static String greeting(String name) {
        return "Hello " + name;
    }

    public static Float sum(Float num1, Float num2) {
        return num1 + num2;
    }

    public static String randomStringFromGivenArray(String[] arrayOfStrings) {
        Random rand = new Random();
        Integer randomInteger = rand.nextInt(arrayOfStrings.length);
        return arrayOfStrings[randomInteger];
    }

}
