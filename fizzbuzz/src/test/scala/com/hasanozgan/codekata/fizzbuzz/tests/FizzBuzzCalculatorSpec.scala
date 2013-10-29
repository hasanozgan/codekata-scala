package com.hasanozgan.codekata.fizzbuzz.tests

import org.specs2.mutable._
import com.hasanozgan.codekata.fizzbuzz.FizzBuzzCalculator

class FizzBuzzCalculatorSpec extends Specification {
  "fizzBuzz function" should {
    "return itself if parameter non divisible by neither 3 nor 5" in {
       val fizzBuzz = new FizzBuzzCalculator()
       fizzBuzz.calculate(1) must beEqualTo("1")
    }

    "return 'fizz' if parameter divisible by 3 and not by 5" in {
       val fizzBuzz = new FizzBuzzCalculator()
       fizzBuzz.calculate(6) must beEqualTo("fizz")
    }

    "return 'buzz' if parameter divisible by 5 and not by 3" in {
       val fizzBuzz = new FizzBuzzCalculator()
       fizzBuzz.calculate(20) must beEqualTo("buzz")
    }

    "return 'fizzbuzz' if parameter divisible by 3 and 5" in {
       val fizzBuzz = new FizzBuzzCalculator()
       fizzBuzz.calculate(15) must beEqualTo("fizzbuzz")
    }
  }
}
