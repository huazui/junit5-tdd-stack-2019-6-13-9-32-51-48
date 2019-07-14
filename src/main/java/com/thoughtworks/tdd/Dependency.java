package com.thoughtworks.tdd;

public class Dependency {
    public String fizzBuzz(int  i) {
        if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0)
            return "FizzBuzzWhizz";
        else if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0 && i % 7 == 0) {
            return "FizzWhizz";
        } else if (i % 5 == 0 && i % 7 == 0) {
            return "BuzzWhizz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0)
            return "Buzz";
        else if (i % 7 == 0)
            return "Whizz";
        else {
            return "" + i;
        }
    }





}
