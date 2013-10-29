package com.hasanozgan.codekata.primefactors.tests

import org.specs2.mutable._
import com.hasanozgan.codekata.primefactors.PrimeFactors

class PrimeFactorsSpec extends Specification {
  "should of empty list for 1" in {
    PrimeFactors.of(1) must be equalTo(List[Int]())
  }
  "should of a list with 2 in it for 2" in {
    PrimeFactors.of(2) must be equalTo(List[Int](2))
  }
  "should of list with 3 in it for 3" in {
    PrimeFactors.of(3) must be equalTo(List[Int](3))
  }
  "should of a list with 2 and 2 in it for 4" in {
    PrimeFactors.of(4) must be equalTo(List[Int](2,2))
  }
  "should of a list with 2 and 3 in it for 6" in {
    PrimeFactors.of(6) must be equalTo(List[Int](2,3))
  }
  "should of list with three 2s for 8" in {
    PrimeFactors.of(8) must be equalTo(List[Int](2,2,2))
  }
  "should of list with two 3s for 9" in {
    PrimeFactors.of(9) must be equalTo(List[Int](3,3))
  }
}
