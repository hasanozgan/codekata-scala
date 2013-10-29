package com.hasanozgan.codekata.fizzbuzz

object FizzBuzzPrinter extends Application {
    
    var fizzBuzz = new FizzBuzzCalculator();

    (1 until 100 inclusive) foreach { value => 
        print(fizzBuzz.calculate(value) + " ") 
    }

    println()
}
