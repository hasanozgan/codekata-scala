package com.hasanozgan.codekata.fizzbuzz

class FizzBuzzCalculator {
  def calculate(parameter : Int) : String = parameter match {
    case number if (isDivisibleBy(number, 15)) => "fizzbuzz"
    case number if isDivisibleBy(number, 3)  => "fizz"
    case number if isDivisibleBy(number, 5) => "buzz"    
    case _ => parameter.toString
  }

  def isDivisibleBy(number : Int, factor : Int) = {
    number % factor == 0
  }
}

